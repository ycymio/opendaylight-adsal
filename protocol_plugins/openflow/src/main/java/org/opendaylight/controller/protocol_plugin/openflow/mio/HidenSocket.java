package org.opendaylight.controller.protocol_plugin.openflow.mio;


import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.opendaylight.controller.protocol_plugin.openflow.internal.FlowProgrammerService;

public class HidenSocket implements Runnable{
    
//    private FlowProgrammerService fps = null;
//    
//    public HidenSocket(FlowProgrammerService father) {
//        this.fps=father;
//    }


    private ServerSocket server = null;
    private Socket socket =null;
    
    public boolean tryToLog(String read) {
        boolean flag = false;
        String[] tupleString = read.split(" ");
        short port = new Short(tupleString[0]);
        int saddr = new Integer(tupleString[1]);
        int daddr = new Integer(tupleString[2]);
        DetectionKey dk = new DetectionKey(port, saddr, daddr);
        if(FlowProgrammerService.detectionAll.containsKey(dk)){
            DetectionDetail dd = FlowProgrammerService.detectionAll.get(dk);
            dd.setLog(tupleString[3]);
            flag = true; 
        }
        return flag;
    }
    
    @Override
    public void run() {
        FileOutputStream out = null;
        BufferedReader in = null;
        System.out.println("Server started in 6000");
        try {
            server = new ServerSocket(6000);
        } catch (IOException e1) {
            e1.printStackTrace();
        } 
        while(true) {
            try {
                socket=server.accept();

                String path="/root/test/testfilelog.log";
                File file=new File(path);
                if(!file.exists())
                    file.createNewFile();

                out = new FileOutputStream(file,false); //如果追加方式用true        
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String read = in.readLine();
                while(true){
                    System.out.println("Client:"+read);
                    
                    out.write(read.getBytes("utf-8"));//注意需要转换对应的字符集
                    read = in.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if ( out != null ) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if ( in != null ) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if ( socket != null ) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
    public void close() {
        if ( server != null ) {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
