package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf;
import com.google.common.collect.Range;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.TestingDep;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;
import java.util.Arrays;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.ComplexList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.Peers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.ExtendEnum;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.ExtendOnce;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.TestingDeps;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.UnionTest;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoC;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.test.types.rev131127.ExtendTwice;
import java.math.BigDecimal;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.impl.netconf.DtoD;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf
 */
public class ImplNetconfBuilder {

    private byte[] _binaryLeaf;
    private List<ComplexList> _complexList;
    private DtoC _dtoC;
    private DtoD _dtoD;
    private ExtendOnce _extended;
    private static List<Range<BigInteger>> _extended_range;
    private ExtendEnum _extendedEnum;
    private ExtendTwice _extendedTwice;
    private IpAddress _ip;
    private List<Peers> _peers;
    private BigInteger _simpleBigInteger;
    private static List<Range<BigInteger>> _simpleBigInteger_range;
    private java.lang.Byte _simpleByte;
    private java.lang.Long _simpleInt;
    private static List<Range<BigInteger>> _simpleInt_range;
    private List<java.lang.Integer> _simpleList;
    private java.lang.Long _simpleLong;
    private java.lang.Long _simpleLong2;
    private static List<Range<BigInteger>> _simpleLong2_range;
    private java.lang.Short _simpleShort;
    private static List<Range<BigInteger>> _simpleShort_range;
    private java.lang.Integer _simpleTest;
    private static List<Range<BigInteger>> _simpleTest_range;
    private BigDecimal _sleepFactor;
    private TestingDep _testingDep;
    private List<TestingDeps> _testingDeps;
    private java.lang.String _type;
    private UnionTest _unionTestAttr;
    private java.lang.Boolean _simpleBoolean;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> augmentation = new HashMap<>();

    public ImplNetconfBuilder() {
    } 

    public ImplNetconfBuilder(ImplNetconf base) {
        this._binaryLeaf = base.getBinaryLeaf();
        this._complexList = base.getComplexList();
        this._dtoC = base.getDtoC();
        this._dtoD = base.getDtoD();
        this._extended = base.getExtended();
        this._extendedEnum = base.getExtendedEnum();
        this._extendedTwice = base.getExtendedTwice();
        this._ip = base.getIp();
        this._peers = base.getPeers();
        this._simpleBigInteger = base.getSimpleBigInteger();
        this._simpleByte = base.getSimpleByte();
        this._simpleInt = base.getSimpleInt();
        this._simpleList = base.getSimpleList();
        this._simpleLong = base.getSimpleLong();
        this._simpleLong2 = base.getSimpleLong2();
        this._simpleShort = base.getSimpleShort();
        this._simpleTest = base.getSimpleTest();
        this._sleepFactor = base.getSleepFactor();
        this._testingDep = base.getTestingDep();
        this._testingDeps = base.getTestingDeps();
        this._type = base.getType();
        this._unionTestAttr = base.getUnionTestAttr();
        this._simpleBoolean = base.isSimpleBoolean();
        if (base instanceof ImplNetconfImpl) {
            ImplNetconfImpl _impl = (ImplNetconfImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public byte[] getBinaryLeaf() {
        return _binaryLeaf;
    }
    
    public List<ComplexList> getComplexList() {
        return _complexList;
    }
    
    public DtoC getDtoC() {
        return _dtoC;
    }
    
    public DtoD getDtoD() {
        return _dtoD;
    }
    
    public ExtendOnce getExtended() {
        return _extended;
    }
    
    public ExtendEnum getExtendedEnum() {
        return _extendedEnum;
    }
    
    public ExtendTwice getExtendedTwice() {
        return _extendedTwice;
    }
    
    public IpAddress getIp() {
        return _ip;
    }
    
    public List<Peers> getPeers() {
        return _peers;
    }
    
    public BigInteger getSimpleBigInteger() {
        return _simpleBigInteger;
    }
    
    public java.lang.Byte getSimpleByte() {
        return _simpleByte;
    }
    
    public java.lang.Long getSimpleInt() {
        return _simpleInt;
    }
    
    public List<java.lang.Integer> getSimpleList() {
        return _simpleList;
    }
    
    public java.lang.Long getSimpleLong() {
        return _simpleLong;
    }
    
    public java.lang.Long getSimpleLong2() {
        return _simpleLong2;
    }
    
    public java.lang.Short getSimpleShort() {
        return _simpleShort;
    }
    
    public java.lang.Integer getSimpleTest() {
        return _simpleTest;
    }
    
    public BigDecimal getSleepFactor() {
        return _sleepFactor;
    }
    
    public TestingDep getTestingDep() {
        return _testingDep;
    }
    
    public List<TestingDeps> getTestingDeps() {
        return _testingDeps;
    }
    
    public java.lang.String getType() {
        return _type;
    }
    
    public UnionTest getUnionTestAttr() {
        return _unionTestAttr;
    }
    
    public java.lang.Boolean isSimpleBoolean() {
        return _simpleBoolean;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ImplNetconfBuilder setBinaryLeaf(byte[] value) {
        this._binaryLeaf = value;
        return this;
    }
    
    public ImplNetconfBuilder setComplexList(List<ComplexList> value) {
        this._complexList = value;
        return this;
    }
    
    public ImplNetconfBuilder setDtoC(DtoC value) {
        this._dtoC = value;
        return this;
    }
    
    public ImplNetconfBuilder setDtoD(DtoD value) {
        this._dtoD = value;
        return this;
    }
    
    public ImplNetconfBuilder setExtended(ExtendOnce value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value.getValue());
            boolean isValidRange = false;
            for (Range<BigInteger> r : _extended_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _extended_range));
            }
        }
        this._extended = value;
        return this;
    }
    public static List<Range<BigInteger>> _extended_range() {
        if (_extended_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_extended_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _extended_range = builder.build();
                }
            }
        }
        return _extended_range;
    }
    
    public ImplNetconfBuilder setExtendedEnum(ExtendEnum value) {
        this._extendedEnum = value;
        return this;
    }
    
    public ImplNetconfBuilder setExtendedTwice(ExtendTwice value) {
        this._extendedTwice = value;
        return this;
    }
    
    public ImplNetconfBuilder setIp(IpAddress value) {
        this._ip = value;
        return this;
    }
    
    public ImplNetconfBuilder setPeers(List<Peers> value) {
        this._peers = value;
        return this;
    }
    
    public ImplNetconfBuilder setSimpleBigInteger(BigInteger value) {
        if (value != null) {
            BigInteger _constraint = value;
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleBigInteger_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleBigInteger_range));
            }
        }
        this._simpleBigInteger = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleBigInteger_range() {
        if (_simpleBigInteger_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_simpleBigInteger_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, new BigInteger("18446744073709551615")));
                    _simpleBigInteger_range = builder.build();
                }
            }
        }
        return _simpleBigInteger_range;
    }
    
    public ImplNetconfBuilder setSimpleByte(java.lang.Byte value) {
        this._simpleByte = value;
        return this;
    }
    
    public ImplNetconfBuilder setSimpleInt(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleInt_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleInt_range));
            }
        }
        this._simpleInt = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleInt_range() {
        if (_simpleInt_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_simpleInt_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _simpleInt_range = builder.build();
                }
            }
        }
        return _simpleInt_range;
    }
    
    public ImplNetconfBuilder setSimpleList(List<java.lang.Integer> value) {
        this._simpleList = value;
        return this;
    }
    
    public ImplNetconfBuilder setSimpleLong(java.lang.Long value) {
        this._simpleLong = value;
        return this;
    }
    
    public ImplNetconfBuilder setSimpleLong2(java.lang.Long value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleLong2_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleLong2_range));
            }
        }
        this._simpleLong2 = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleLong2_range() {
        if (_simpleLong2_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_simpleLong2_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
                    _simpleLong2_range = builder.build();
                }
            }
        }
        return _simpleLong2_range;
    }
    
    public ImplNetconfBuilder setSimpleShort(java.lang.Short value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleShort_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleShort_range));
            }
        }
        this._simpleShort = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleShort_range() {
        if (_simpleShort_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_simpleShort_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(255L)));
                    _simpleShort_range = builder.build();
                }
            }
        }
        return _simpleShort_range;
    }
    
    public ImplNetconfBuilder setSimpleTest(java.lang.Integer value) {
        if (value != null) {
            BigInteger _constraint = BigInteger.valueOf(value);
            boolean isValidRange = false;
            for (Range<BigInteger> r : _simpleTest_range()) {
                if (r.contains(_constraint)) {
                    isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, _simpleTest_range));
            }
        }
        this._simpleTest = value;
        return this;
    }
    public static List<Range<BigInteger>> _simpleTest_range() {
        if (_simpleTest_range == null) {
            synchronized (ImplNetconfBuilder.class) {
                if (_simpleTest_range == null) {
                    ImmutableList.Builder<Range<BigInteger>> builder = ImmutableList.builder();
                    builder.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(65535L)));
                    _simpleTest_range = builder.build();
                }
            }
        }
        return _simpleTest_range;
    }
    
    public ImplNetconfBuilder setSleepFactor(BigDecimal value) {
        this._sleepFactor = value;
        return this;
    }
    
    public ImplNetconfBuilder setTestingDep(TestingDep value) {
        this._testingDep = value;
        return this;
    }
    
    public ImplNetconfBuilder setTestingDeps(List<TestingDeps> value) {
        this._testingDeps = value;
        return this;
    }
    
    public ImplNetconfBuilder setType(java.lang.String value) {
        this._type = value;
        return this;
    }
    
    public ImplNetconfBuilder setUnionTestAttr(UnionTest value) {
        this._unionTestAttr = value;
        return this;
    }
    
    public ImplNetconfBuilder setSimpleBoolean(java.lang.Boolean value) {
        this._simpleBoolean = value;
        return this;
    }
    
    public ImplNetconfBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ImplNetconf build() {
        return new ImplNetconfImpl(this);
    }

    private static final class ImplNetconfImpl implements ImplNetconf {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf.class;
        }

        private final byte[] _binaryLeaf;
        private final List<ComplexList> _complexList;
        private final DtoC _dtoC;
        private final DtoD _dtoD;
        private final ExtendOnce _extended;
        private final ExtendEnum _extendedEnum;
        private final ExtendTwice _extendedTwice;
        private final IpAddress _ip;
        private final List<Peers> _peers;
        private final BigInteger _simpleBigInteger;
        private final java.lang.Byte _simpleByte;
        private final java.lang.Long _simpleInt;
        private final List<java.lang.Integer> _simpleList;
        private final java.lang.Long _simpleLong;
        private final java.lang.Long _simpleLong2;
        private final java.lang.Short _simpleShort;
        private final java.lang.Integer _simpleTest;
        private final BigDecimal _sleepFactor;
        private final TestingDep _testingDep;
        private final List<TestingDeps> _testingDeps;
        private final java.lang.String _type;
        private final UnionTest _unionTestAttr;
        private final java.lang.Boolean _simpleBoolean;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> augmentation = new HashMap<>();

        private ImplNetconfImpl(ImplNetconfBuilder base) {
            this._binaryLeaf = base.getBinaryLeaf();
            this._complexList = base.getComplexList();
            this._dtoC = base.getDtoC();
            this._dtoD = base.getDtoD();
            this._extended = base.getExtended();
            this._extendedEnum = base.getExtendedEnum();
            this._extendedTwice = base.getExtendedTwice();
            this._ip = base.getIp();
            this._peers = base.getPeers();
            this._simpleBigInteger = base.getSimpleBigInteger();
            this._simpleByte = base.getSimpleByte();
            this._simpleInt = base.getSimpleInt();
            this._simpleList = base.getSimpleList();
            this._simpleLong = base.getSimpleLong();
            this._simpleLong2 = base.getSimpleLong2();
            this._simpleShort = base.getSimpleShort();
            this._simpleTest = base.getSimpleTest();
            this._sleepFactor = base.getSleepFactor();
            this._testingDep = base.getTestingDep();
            this._testingDeps = base.getTestingDeps();
            this._type = base.getType();
            this._unionTestAttr = base.getUnionTestAttr();
            this._simpleBoolean = base.isSimpleBoolean();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public byte[] getBinaryLeaf() {
            return _binaryLeaf;
        }
        
        @Override
        public List<ComplexList> getComplexList() {
            return _complexList;
        }
        
        @Override
        public DtoC getDtoC() {
            return _dtoC;
        }
        
        @Override
        public DtoD getDtoD() {
            return _dtoD;
        }
        
        @Override
        public ExtendOnce getExtended() {
            return _extended;
        }
        
        @Override
        public ExtendEnum getExtendedEnum() {
            return _extendedEnum;
        }
        
        @Override
        public ExtendTwice getExtendedTwice() {
            return _extendedTwice;
        }
        
        @Override
        public IpAddress getIp() {
            return _ip;
        }
        
        @Override
        public List<Peers> getPeers() {
            return _peers;
        }
        
        @Override
        public BigInteger getSimpleBigInteger() {
            return _simpleBigInteger;
        }
        
        @Override
        public java.lang.Byte getSimpleByte() {
            return _simpleByte;
        }
        
        @Override
        public java.lang.Long getSimpleInt() {
            return _simpleInt;
        }
        
        @Override
        public List<java.lang.Integer> getSimpleList() {
            return _simpleList;
        }
        
        @Override
        public java.lang.Long getSimpleLong() {
            return _simpleLong;
        }
        
        @Override
        public java.lang.Long getSimpleLong2() {
            return _simpleLong2;
        }
        
        @Override
        public java.lang.Short getSimpleShort() {
            return _simpleShort;
        }
        
        @Override
        public java.lang.Integer getSimpleTest() {
            return _simpleTest;
        }
        
        @Override
        public BigDecimal getSleepFactor() {
            return _sleepFactor;
        }
        
        @Override
        public TestingDep getTestingDep() {
            return _testingDep;
        }
        
        @Override
        public List<TestingDeps> getTestingDeps() {
            return _testingDeps;
        }
        
        @Override
        public java.lang.String getType() {
            return _type;
        }
        
        @Override
        public UnionTest getUnionTestAttr() {
            return _unionTestAttr;
        }
        
        @Override
        public java.lang.Boolean isSimpleBoolean() {
            return _simpleBoolean;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_binaryLeaf == null) ? 0 : Arrays.hashCode(_binaryLeaf));
            result = prime * result + ((_complexList == null) ? 0 : _complexList.hashCode());
            result = prime * result + ((_dtoC == null) ? 0 : _dtoC.hashCode());
            result = prime * result + ((_dtoD == null) ? 0 : _dtoD.hashCode());
            result = prime * result + ((_extended == null) ? 0 : _extended.hashCode());
            result = prime * result + ((_extendedEnum == null) ? 0 : _extendedEnum.hashCode());
            result = prime * result + ((_extendedTwice == null) ? 0 : _extendedTwice.hashCode());
            result = prime * result + ((_ip == null) ? 0 : _ip.hashCode());
            result = prime * result + ((_peers == null) ? 0 : _peers.hashCode());
            result = prime * result + ((_simpleBigInteger == null) ? 0 : _simpleBigInteger.hashCode());
            result = prime * result + ((_simpleByte == null) ? 0 : _simpleByte.hashCode());
            result = prime * result + ((_simpleInt == null) ? 0 : _simpleInt.hashCode());
            result = prime * result + ((_simpleList == null) ? 0 : _simpleList.hashCode());
            result = prime * result + ((_simpleLong == null) ? 0 : _simpleLong.hashCode());
            result = prime * result + ((_simpleLong2 == null) ? 0 : _simpleLong2.hashCode());
            result = prime * result + ((_simpleShort == null) ? 0 : _simpleShort.hashCode());
            result = prime * result + ((_simpleTest == null) ? 0 : _simpleTest.hashCode());
            result = prime * result + ((_sleepFactor == null) ? 0 : _sleepFactor.hashCode());
            result = prime * result + ((_testingDep == null) ? 0 : _testingDep.hashCode());
            result = prime * result + ((_testingDeps == null) ? 0 : _testingDeps.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
            result = prime * result + ((_unionTestAttr == null) ? 0 : _unionTestAttr.hashCode());
            result = prime * result + ((_simpleBoolean == null) ? 0 : _simpleBoolean.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf)obj;
            if (_binaryLeaf == null) {
                if (other.getBinaryLeaf() != null) {
                    return false;
                }
            } else if(!Arrays.equals(_binaryLeaf, other.getBinaryLeaf())) {
                return false;
            }
            if (_complexList == null) {
                if (other.getComplexList() != null) {
                    return false;
                }
            } else if(!_complexList.equals(other.getComplexList())) {
                return false;
            }
            if (_dtoC == null) {
                if (other.getDtoC() != null) {
                    return false;
                }
            } else if(!_dtoC.equals(other.getDtoC())) {
                return false;
            }
            if (_dtoD == null) {
                if (other.getDtoD() != null) {
                    return false;
                }
            } else if(!_dtoD.equals(other.getDtoD())) {
                return false;
            }
            if (_extended == null) {
                if (other.getExtended() != null) {
                    return false;
                }
            } else if(!_extended.equals(other.getExtended())) {
                return false;
            }
            if (_extendedEnum == null) {
                if (other.getExtendedEnum() != null) {
                    return false;
                }
            } else if(!_extendedEnum.equals(other.getExtendedEnum())) {
                return false;
            }
            if (_extendedTwice == null) {
                if (other.getExtendedTwice() != null) {
                    return false;
                }
            } else if(!_extendedTwice.equals(other.getExtendedTwice())) {
                return false;
            }
            if (_ip == null) {
                if (other.getIp() != null) {
                    return false;
                }
            } else if(!_ip.equals(other.getIp())) {
                return false;
            }
            if (_peers == null) {
                if (other.getPeers() != null) {
                    return false;
                }
            } else if(!_peers.equals(other.getPeers())) {
                return false;
            }
            if (_simpleBigInteger == null) {
                if (other.getSimpleBigInteger() != null) {
                    return false;
                }
            } else if(!_simpleBigInteger.equals(other.getSimpleBigInteger())) {
                return false;
            }
            if (_simpleByte == null) {
                if (other.getSimpleByte() != null) {
                    return false;
                }
            } else if(!_simpleByte.equals(other.getSimpleByte())) {
                return false;
            }
            if (_simpleInt == null) {
                if (other.getSimpleInt() != null) {
                    return false;
                }
            } else if(!_simpleInt.equals(other.getSimpleInt())) {
                return false;
            }
            if (_simpleList == null) {
                if (other.getSimpleList() != null) {
                    return false;
                }
            } else if(!_simpleList.equals(other.getSimpleList())) {
                return false;
            }
            if (_simpleLong == null) {
                if (other.getSimpleLong() != null) {
                    return false;
                }
            } else if(!_simpleLong.equals(other.getSimpleLong())) {
                return false;
            }
            if (_simpleLong2 == null) {
                if (other.getSimpleLong2() != null) {
                    return false;
                }
            } else if(!_simpleLong2.equals(other.getSimpleLong2())) {
                return false;
            }
            if (_simpleShort == null) {
                if (other.getSimpleShort() != null) {
                    return false;
                }
            } else if(!_simpleShort.equals(other.getSimpleShort())) {
                return false;
            }
            if (_simpleTest == null) {
                if (other.getSimpleTest() != null) {
                    return false;
                }
            } else if(!_simpleTest.equals(other.getSimpleTest())) {
                return false;
            }
            if (_sleepFactor == null) {
                if (other.getSleepFactor() != null) {
                    return false;
                }
            } else if(!_sleepFactor.equals(other.getSleepFactor())) {
                return false;
            }
            if (_testingDep == null) {
                if (other.getTestingDep() != null) {
                    return false;
                }
            } else if(!_testingDep.equals(other.getTestingDep())) {
                return false;
            }
            if (_testingDeps == null) {
                if (other.getTestingDeps() != null) {
                    return false;
                }
            } else if(!_testingDeps.equals(other.getTestingDeps())) {
                return false;
            }
            if (_type == null) {
                if (other.getType() != null) {
                    return false;
                }
            } else if(!_type.equals(other.getType())) {
                return false;
            }
            if (_unionTestAttr == null) {
                if (other.getUnionTestAttr() != null) {
                    return false;
                }
            } else if(!_unionTestAttr.equals(other.getUnionTestAttr())) {
                return false;
            }
            if (_simpleBoolean == null) {
                if (other.isSimpleBoolean() != null) {
                    return false;
                }
            } else if(!_simpleBoolean.equals(other.isSimpleBoolean())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ImplNetconfImpl otherImpl = (ImplNetconfImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.test.impl.rev130403.modules.module.configuration.impl.netconf.ImplNetconf>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ImplNetconf [");
            boolean first = true;
        
            if (_binaryLeaf != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_binaryLeaf=");
                builder.append(Arrays.toString(_binaryLeaf));
             }
            if (_complexList != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_complexList=");
                builder.append(_complexList);
             }
            if (_dtoC != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dtoC=");
                builder.append(_dtoC);
             }
            if (_dtoD != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dtoD=");
                builder.append(_dtoD);
             }
            if (_extended != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_extended=");
                builder.append(_extended);
             }
            if (_extendedEnum != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_extendedEnum=");
                builder.append(_extendedEnum);
             }
            if (_extendedTwice != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_extendedTwice=");
                builder.append(_extendedTwice);
             }
            if (_ip != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ip=");
                builder.append(_ip);
             }
            if (_peers != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_peers=");
                builder.append(_peers);
             }
            if (_simpleBigInteger != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleBigInteger=");
                builder.append(_simpleBigInteger);
             }
            if (_simpleByte != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleByte=");
                builder.append(_simpleByte);
             }
            if (_simpleInt != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleInt=");
                builder.append(_simpleInt);
             }
            if (_simpleList != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleList=");
                builder.append(_simpleList);
             }
            if (_simpleLong != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleLong=");
                builder.append(_simpleLong);
             }
            if (_simpleLong2 != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleLong2=");
                builder.append(_simpleLong2);
             }
            if (_simpleShort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleShort=");
                builder.append(_simpleShort);
             }
            if (_simpleTest != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleTest=");
                builder.append(_simpleTest);
             }
            if (_sleepFactor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sleepFactor=");
                builder.append(_sleepFactor);
             }
            if (_testingDep != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_testingDep=");
                builder.append(_testingDep);
             }
            if (_testingDeps != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_testingDeps=");
                builder.append(_testingDeps);
             }
            if (_type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_type=");
                builder.append(_type);
             }
            if (_unionTestAttr != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_unionTestAttr=");
                builder.append(_unionTestAttr);
             }
            if (_simpleBoolean != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_simpleBoolean=");
                builder.append(_simpleBoolean);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
