package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.Loggers;


public class LoggersKey
 implements Identifier<Loggers> {
    private static final long serialVersionUID = 5313998623988781360L;
    final private java.lang.String _loggerName;

    public LoggersKey(java.lang.String _loggerName) {
    
    
        this._loggerName = _loggerName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LoggersKey(LoggersKey source) {
        this._loggerName = source._loggerName;
    }


    public java.lang.String getLoggerName() {
        return _loggerName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_loggerName == null) ? 0 : _loggerName.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LoggersKey other = (LoggersKey) obj;
        if (_loggerName == null) {
            if (other._loggerName != null) {
                return false;
            }
        } else if(!_loggerName.equals(other._loggerName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.logback.config.rev130716.modules.module.configuration.logback.LoggersKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_loggerName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_loggerName=");
            builder.append(_loggerName);
         }
        return builder.append(']').toString();
    }



}
