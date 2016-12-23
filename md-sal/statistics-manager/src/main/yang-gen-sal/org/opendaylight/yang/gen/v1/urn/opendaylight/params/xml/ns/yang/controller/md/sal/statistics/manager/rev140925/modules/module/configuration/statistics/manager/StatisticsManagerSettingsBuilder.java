package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings} instances.
 * 
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings
 */
public class StatisticsManagerSettingsBuilder {

    private java.lang.Integer _maxNodesForCollector;
    private java.lang.Integer _minRequestNetMonitorInterval;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> augmentation = new HashMap<>();

    public StatisticsManagerSettingsBuilder() {
    } 

    public StatisticsManagerSettingsBuilder(StatisticsManagerSettings base) {
        this._maxNodesForCollector = base.getMaxNodesForCollector();
        this._minRequestNetMonitorInterval = base.getMinRequestNetMonitorInterval();
        if (base instanceof StatisticsManagerSettingsImpl) {
            StatisticsManagerSettingsImpl _impl = (StatisticsManagerSettingsImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Integer getMaxNodesForCollector() {
        return _maxNodesForCollector;
    }
    
    public java.lang.Integer getMinRequestNetMonitorInterval() {
        return _minRequestNetMonitorInterval;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public StatisticsManagerSettingsBuilder setMaxNodesForCollector(java.lang.Integer value) {
        this._maxNodesForCollector = value;
        return this;
    }
    
    public StatisticsManagerSettingsBuilder setMinRequestNetMonitorInterval(java.lang.Integer value) {
        this._minRequestNetMonitorInterval = value;
        return this;
    }
    
    public StatisticsManagerSettingsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public StatisticsManagerSettings build() {
        return new StatisticsManagerSettingsImpl(this);
    }

    private static final class StatisticsManagerSettingsImpl implements StatisticsManagerSettings {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings.class;
        }

        private final java.lang.Integer _maxNodesForCollector;
        private final java.lang.Integer _minRequestNetMonitorInterval;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> augmentation = new HashMap<>();

        private StatisticsManagerSettingsImpl(StatisticsManagerSettingsBuilder base) {
            this._maxNodesForCollector = base.getMaxNodesForCollector();
            this._minRequestNetMonitorInterval = base.getMinRequestNetMonitorInterval();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Integer getMaxNodesForCollector() {
            return _maxNodesForCollector;
        }
        
        @Override
        public java.lang.Integer getMinRequestNetMonitorInterval() {
            return _minRequestNetMonitorInterval;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_maxNodesForCollector == null) ? 0 : _maxNodesForCollector.hashCode());
            result = prime * result + ((_minRequestNetMonitorInterval == null) ? 0 : _minRequestNetMonitorInterval.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings)obj;
            if (_maxNodesForCollector == null) {
                if (other.getMaxNodesForCollector() != null) {
                    return false;
                }
            } else if(!_maxNodesForCollector.equals(other.getMaxNodesForCollector())) {
                return false;
            }
            if (_minRequestNetMonitorInterval == null) {
                if (other.getMinRequestNetMonitorInterval() != null) {
                    return false;
                }
            } else if(!_minRequestNetMonitorInterval.equals(other.getMinRequestNetMonitorInterval())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StatisticsManagerSettingsImpl otherImpl = (StatisticsManagerSettingsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.statistics.manager.rev140925.modules.module.configuration.statistics.manager.StatisticsManagerSettings>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("StatisticsManagerSettings [");
            boolean first = true;
        
            if (_maxNodesForCollector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxNodesForCollector=");
                builder.append(_maxNodesForCollector);
             }
            if (_minRequestNetMonitorInterval != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_minRequestNetMonitorInterval=");
                builder.append(_minRequestNetMonitorInterval);
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
