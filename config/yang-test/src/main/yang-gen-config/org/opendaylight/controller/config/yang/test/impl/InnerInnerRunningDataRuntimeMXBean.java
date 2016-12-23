package org.opendaylight.controller.config.yang.test.impl;
public interface InnerInnerRunningDataRuntimeMXBean extends org.opendaylight.controller.config.api.runtime.RuntimeBean {
    public java.util.List<org.opendaylight.controller.config.yang.test.impl.NotStateBean> getNotStateBean();

    public java.lang.Integer getSimpleInt3();

    public org.opendaylight.controller.config.yang.test.impl.Deep3 getDeep3();

    public java.util.List<java.lang.String> getListOfStrings();

    public org.opendaylight.controller.config.yang.test.impl.RetValContainer containerOutput();

    public java.lang.Boolean noArgInnerInner(java.lang.Integer arg1, java.lang.Boolean arg2);

    public java.util.List<java.lang.String> leafListOutput();

    public java.util.List<org.opendaylight.controller.config.yang.test.impl.RetValList> listOutput();

}
