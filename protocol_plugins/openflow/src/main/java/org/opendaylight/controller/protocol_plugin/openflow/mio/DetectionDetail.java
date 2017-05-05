package org.opendaylight.controller.protocol_plugin.openflow.mio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.opendaylight.controller.protocol_plugin.openflow.internal.FlowProgrammerService;

public class DetectionDetail {
    private static int modeCode;
    private short port;
    private int networkSource;
    private int networkDestination;
    private List<DetectionValue> ownReply;
    private List<DetectionValue> ownReplyForFirst;
    private List<DetectionValue> ownReplyForSecond;
    private List<DetectionValue> firstReply;
    private List<DetectionValue> firstReplyForOwn;
    private List<DetectionValue> secondReply;
    private List<DetectionValue> secondReplyForOwn;

    private boolean firstFlag = false;
    private boolean o_f_doneFlag = false;
    private boolean o_s_doneFlag = false;
    private boolean successFlag = false;
    private byte errorFlag = 0;//0000 0000:5:have error;6:o-f error;7:o-s error;8:other error
    
    private long errorTime=0;
    private long errorTimeFirst=0;
    private long errorTimeSecond=0;
    
    public boolean isErrorFlag() {
        return errorFlag>0;
    }

    public String getErrorTime() {
        return "::errorFlag:"+errorFlag+" errorTime:"+errorTime+" errorTimeFirst:"+errorTimeFirst+" errorTimeSecond:"+errorTimeSecond+"\n";
    }
    
    public long getErrorTimeFirst() {
        return errorTimeFirst;
    }
    
    public long getErrorTimeSecond() {
        return errorTimeSecond;
    }

    public List<DetectionValue> getOwnReply() {
        return ownReply;
    }

    public void setOwnReply(List<DetectionValue> ownReply) {
        this.ownReply = ownReply;
    }


    class longWaitThread implements Runnable{
        public longWaitThread() {
            firstFlag=true;
        }
        public void run() {
            // check
            try {
                Thread.sleep(40000);
                boolean flag = false;
                flag=compareAll();
                if(flag==true){
//                    System.out.println("modecode:0:DD has completed successfully with :"+detailShow());
                    DetectionKey key =new DetectionKey(port, networkSource, networkDestination);
                    FlowProgrammerService.detectionAll.remove(key);
                }
                else{
                    errorFlag=(byte) (errorFlag|(0x09));
                    errorTime= System.currentTimeMillis();
                    System.out.println("modecode:0:DD has completed with error:dv mismatch"+detailShow());
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("hello");
            }
        }
    }
    
    private volatile long nextAskTime;
    
    public synchronized void refreshNextTime() {
        nextAskTime = System.currentTimeMillis() + 20000;
    }
   

    class shortWaitThread implements Runnable{
        public boolean stopFlag = false;
        public shortWaitThread() {
            firstFlag=true;
        }
        public void run() {
            try {
                while (stopFlag==false) {
                    if((errorFlag>0)||(successFlag == true)){
                        stopFlag = true;
                        break;
                    }
                    long current = System.currentTimeMillis();
                    long k = nextAskTime- current ;
                    if (k > 0) {
                        Thread.sleep(k);
                    } 
                    else {
                        
                       stopFlag=true;
                       if(o_f_doneFlag == false){
                           if((errorFlag&0x04)==0){
                               errorFlag=(byte) (errorFlag|(0x0D));
                               errorTime=System.currentTimeMillis();
                               errorTimeFirst=System.currentTimeMillis();
                               System.out.println("modecode:1:Error code:1:DD overtimes with o_f undone:"+detailShow());
                           }
                       }
                       if(o_s_doneFlag == false){
                           if((errorFlag&0x02)==0){
                               errorFlag=(byte) (errorFlag|(0x0B));
                               errorTime=System.currentTimeMillis();
                               errorTimeSecond=System.currentTimeMillis();
                               System.out.println("modecode:1:Error code:2:DD overtimes with o_s undone:"+detailShow());
                           }
                       }
                       if(o_s_doneFlag&&o_f_doneFlag){
                           successFlag=true;
//                           System.out.println("modecode:1:DD has completed successfully with :"+detailShow());
                           DetectionKey key =new DetectionKey(port, networkSource, networkDestination);
                           FlowProgrammerService.detectionAll.remove(key);
                       }
                    }
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
//                System.out.println("hello");
            }
        }
    }

    public DetectionDetail(short port, int sourceip, int destip, int mode) {
        super();
        this.port = port;
        this.networkSource = sourceip;
        this.networkDestination = destip;
        this.modeCode = mode;
        this.ownReply = new ArrayList<DetectionValue>();
        this.ownReplyForFirst= new ArrayList<DetectionValue>();
        this.ownReplyForSecond= new ArrayList<DetectionValue>();
        this.firstReply = new ArrayList<DetectionValue>();
        this.firstReplyForOwn = new ArrayList<DetectionValue>();
        this.secondReply = new ArrayList<DetectionValue>();
        this.secondReplyForOwn = new ArrayList<DetectionValue>();
    }

    public void addPktInfoComplex(DetectionValue dv, int pktFlag){
        if(pktFlag==0){
            System.out.println("modecode:1:Error code:3:pktFlag == 0 in single dv adding");
          }
          else if(pktFlag==1){
              this.firstReply.add(dv);
              if(o_f_doneFlag == true){
                  if((errorFlag&0x04)==0){
                      errorFlag=(byte) (errorFlag|(0x0C));
                      errorTimeFirst=System.currentTimeMillis();
                      System.out.println("modecode:1:Error code:4:there is an extra dv of o_f:"+detailShow());
                  }
              }
              else{
                  if(ownReplyForFirst.size()>0){
                      if(ownReplyForFirst.contains(dv)){
                          ownReplyForFirst.remove(dv);
                          if(ownReplyForFirst.size() ==0){
                              o_f_doneFlag = true;
                          }
                      }
                      else{
                          if((errorFlag&0x04)==0){
                              errorFlag=(byte) (errorFlag|(0x0C));
                              errorTimeFirst=System.currentTimeMillis();
                              System.out.println("modecode:1:Error code:4:there is a unrecognized dv of o_f:"+detailShow());
                          }
                      }
                  }
                  else {
                      firstReplyForOwn.add(dv);
                  }
              }
          }
          else if(pktFlag==2){
              this.secondReply.add(dv);
              if(o_s_doneFlag == true){
                  //error
                  if((errorFlag&0x02)==0){
                      errorFlag=(byte) (errorFlag|(0x0A));
                      errorTimeSecond=System.currentTimeMillis();
                      System.out.println("modecode:1:Error code:5:there is an extra dv of o_s:"+detailShow());
                  }
              }
              else{
                  if(ownReplyForSecond.size()>0){
                      if(ownReplyForSecond.contains(dv)){
                          ownReplyForSecond.remove(dv);
                          if(ownReplyForSecond.size() ==0){
                              o_s_doneFlag = true;
                          }
                      }
                      else{
                          if((errorFlag&0x02)==0){
                              errorFlag=(byte) (errorFlag|(0x0A));
                              errorTimeSecond=System.currentTimeMillis();
                              System.out.println("modecode:1:Error code:6:there is a unrecognized dv of o_s:"+detailShow());
                          }
                      }
                  }
                  else {
                      secondReplyForOwn.add(dv);
                  }
              }
          }
          else{
              if((errorFlag&0x01)==0){
                  errorFlag=(byte) (errorFlag|(0x09));
                  errorTime=System.currentTimeMillis();
                  System.out.println("modecode:1:Error code:7:pktFlag unrecognized in single dv adding"+pktFlag);
              }
          }
    }
    
    public void addPktInfo(DetectionValue dv, int pktFlag){
        if(modeCode == 0){
            if(firstFlag==false){
                longWaitThread myThread=new longWaitThread();
                new Thread(myThread).start();
            }
            if(pktFlag==0){
                System.out.println("modecode:0:Error code:3:pktFlag == 0 in single dv adding");
            }
            else if(pktFlag==1){
                this.firstReply.add(dv);
                this.firstReplyForOwn.add(dv);
            }
            else if(pktFlag==2){
                this.secondReply.add(dv);
                this.secondReplyForOwn.add(dv);
            }
            else{
                System.out.println("modecode:0:Error code:7:pktFlag unrecognized in single dv adding"+pktFlag);
            }
        }
        else if(modeCode == 1){
            refreshNextTime();
            if(firstFlag==false){
                shortWaitThread myThread=new shortWaitThread();
                new Thread(myThread).start();
            }
            addPktInfoComplex(dv,pktFlag);
        }
        else{
            System.out.println("modecode:?:Error code:1:modecode unrecognized in single dv adding"+modeCode);
        }
    }

    public void addPktInfoComplex(List<DetectionValue> dvl, int pktFlag){
        if(pktFlag==0){
            for(int i=0; i<dvl.size();i++){
                DetectionValue dv = dvl.get(i);
                this.ownReply.add(dv);
                
                if(firstReplyForOwn.size()>0){
                    if(firstReplyForOwn.contains(dv)){
                        firstReplyForOwn.remove(dv);
                    }
                    else{
                        ownReplyForFirst.add(dv);
                    }
                }
                else{
                    ownReplyForFirst.add(dv);
                }
                
                if(secondReplyForOwn.size()>0){
                    if(secondReplyForOwn.contains(dv)){
                        secondReplyForOwn.remove(dv);
                    }
                    else{
                        ownReplyForSecond.add(dv);
                    }
                }
                else{
                    ownReplyForSecond.add(dv);
                }
            }
            
            if(firstReplyForOwn.size()>0){
                if((errorFlag&0x04)==0){
                    errorFlag=(byte) (errorFlag|(0x0C));
                    errorTimeFirst=System.currentTimeMillis();
                    System.out.println("modecode:1:Error code:8:there is a unrecognized dv of o_s:"+detailShow());
                }
            }
            else{
                if(ownReplyForFirst.size()==0){
                    o_f_doneFlag=true;
                }
            }
            
            if(secondReplyForOwn.size()>0){
                if((errorFlag&0x02)==0){
                    errorFlag=(byte) (errorFlag|(0x0A));
                    errorTimeSecond=System.currentTimeMillis();
                    System.out.println("modecode:1:Error code:9:there is a unrecognized dv of o_f:"+detailShow());
                }
            }
            else{
                if(ownReplyForSecond.size()==0){
                    o_s_doneFlag=true;
                }
            }
            
            if(o_f_doneFlag&&o_s_doneFlag){
                successFlag = true;
//                System.out.println("modecode:1:DD has completed successfully in advance with :"+detailShow());
            }
        }
        else if(pktFlag==1){
            System.out.println("modecode:1:Error code:10:pktFlag == 1 in dvl adding");
        }
        else if(pktFlag==2){
            System.out.println("modecode:1:Error code:11:pktFlag == 2 in dvl adding");
        }
        else{
            //have error
        }
    }
    
    public void addPktInfo(List<DetectionValue> dvl, int pktFlag){
        if(modeCode == 0){
            if(firstFlag==false){
                longWaitThread myThread=new longWaitThread();
                new Thread(myThread).start();
            }
            
            if(pktFlag==0){
                for(int i=0; i<dvl.size();i++){
                    DetectionValue dv = dvl.get(i);
                    this.ownReply.add(dv);
                    ownReplyForFirst.add(dv);
                    ownReplyForSecond.add(dv);
                }
            }
            else if(pktFlag==1){
                System.out.println("modecode:0:Error code:12:pktFlag == 1 in dvl adding");
            }
            else if(pktFlag==2){
                System.out.println("modecode:0:Error code:13:pktFlag == 2 in dvl adding");
            }
            else{
                if((errorFlag&0x01)==0){
                    errorFlag=(byte) (errorFlag|(0x09));
                    errorTime=System.currentTimeMillis();
                    System.out.println("modecode:0:Error code:14:there is a unrecognized pktFlag:"+pktFlag);
                }
            }
          
        }
        else if(modeCode == 1){
            refreshNextTime();
            if(firstFlag==false){
                shortWaitThread myThread=new shortWaitThread();
                new Thread(myThread).start();
            }
            addPktInfoComplex(dvl, pktFlag);
        }
        else{
            if((errorFlag&0x01)==0){
                errorFlag=(byte) (errorFlag|(0x09));
                errorTime=System.currentTimeMillis();
                System.out.println("modecode:1:Error code:15:there is a unrecognized pktFlag:"+pktFlag);
            }
        }
    }   

    public boolean compareTwo(List<DetectionValue> a, List<DetectionValue> b) {
        if(a.size() != b.size())
          return false;
        if(a.containsAll(b) && b.containsAll(a))
          return true;
        else {
            return false;
        }
    }

    public boolean compareAll(){
        o_f_doneFlag=compareTwo(this.ownReplyForFirst, this.firstReplyForOwn);
        o_s_doneFlag=compareTwo(this.ownReplyForSecond, this.secondReplyForOwn);
        return o_f_doneFlag&& o_s_doneFlag;
    }
    
    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }
    
    public int getNetworkSource() {
        return networkSource;
    }

    public void setNetworkSource(int networkSource) {
        this.networkSource = networkSource;
    }

    public int getNetworkDestination() {
        return networkDestination;
    }

    public void setNetworkDestination(int networkDestination) {
        this.networkDestination = networkDestination;
    }
    
    
    @Override
    public String toString() {
        return "DetectionDetail [port=" + port + ", networkSource="
                + networkSource + ", networkDestination=" + networkDestination + ", \n" 
                + "\t ownReply=" + ownReply + ", \n" 
                + "\t ownReplyForFirst=" + ownReplyForFirst + ", \n" 
                + "\t,ownReplyForSecond=" + ownReplyForSecond + ", \n" 
                + "\t firstReply=" + firstReply + ", firstReplyForOwn=" + firstReplyForOwn + ", \n" 
                + "\t secondReply=" + secondReply + ", secondReplyForOwn=" + secondReplyForOwn  + ", \n" 
                + "\t, firstFlag=" + firstFlag
                + ", o_f_doneFlag=" + o_f_doneFlag + ", o_s_doneFlag=" + o_s_doneFlag + ", errorFlag=" + errorFlag
                + ", nextAskTime=" + nextAskTime + "]:" + " ______________________________________\n\n\n";
    }




    public String detailShow() {
        return "DetectionDetail [port=" + port + ", networkSource="
                + networkSource + ", networkDestination=" + networkDestination + ", \n" 
                + "\t ownReply=" + ownReply + ", \n" 
                + "\t ownReplyForFirst=" + ownReplyForFirst + ", \n" 
                + "\t,ownReplyForSecond=" + ownReplyForSecond + ", \n" 
                + "\t firstReply=" + firstReply + ", firstReplyForOwn=" + firstReplyForOwn + ", \n" 
                + "\t secondReply=" + secondReply + ", secondReplyForOwn=" + secondReplyForOwn  + ", \n" 
                + "\t, firstFlag=" + firstFlag
                + ", o_f_doneFlag=" + o_f_doneFlag + ", o_s_doneFlag=" + o_s_doneFlag + ", errorFlag=" + errorFlag
                + ", nextAskTime=" + nextAskTime + "]:" + " ______________________________________\n\n\n";
    }
    
    public String briefShow() {
        return "DetectionDetail [port=" + port + ", networkSource="
                + networkSource + ", networkDestination=" + networkDestination + "]" ;
    }

}
