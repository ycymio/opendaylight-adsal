package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.netconf.monitoring.rev101004.NetconfState;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * NETCONF Monitoring Module. All elements in this module are read-only. Copyright 
 * (c) 2010 IETF Trust and the persons identified as authors of the code. All 
 * rights reserved. Redistribution and use in source and binary forms, with or 
 * without modification, is permitted pursuant to, and subject to the license terms
 * contained in, the Simplified BSD License set forth in Section 4.c of the IETF 
 * Trust's Legal Provisions Relating to IETF Documents 
 * (http://trustee.ietf.org/license-info). This version of this YANG module is part
 * of RFC 6022; see the RFC itself for full legal notices.
 * 
 * <p>This class represents the following YANG schema fragment defined in module <b>ietf-netconf-monitoring</b>
 * <br />Source path: <i>META-INF\yang\ietf-netconf-monitoring.yang</i>):
 * <pre>
 * module ietf-netconf-monitoring {
 *     yang-version 1;
 *     namespace "urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring";
 *     prefix "ncm";
 * 
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2010-10-04 {
 *         description "NETCONF Monitoring Module. All elements in this module are read-only. Copyright 
 *                     (c) 2010 IETF Trust and the persons identified as authors of the code. All 
 *                     rights reserved. Redistribution and use in source and binary forms, with or 
 *                     without modification, is permitted pursuant to, and subject to the license terms
 *                     contained in, the Simplified BSD License set forth in Section 4.c of the IETF 
 *                     Trust's Legal Provisions Relating to IETF Documents 
 *                     (http://trustee.ietf.org/license-info). This version of this YANG module is part
 *                     of RFC 6022; see the RFC itself for full legal notices.
 *         ";
 *     }
 * 
 *     container netconf-state {
 *         container capabilities {
 *             leaf-list capability {
 *                 type uri;
 *             }
 *         }
 *         container datastores {
 *             list datastore {
 *                 key "name"
 *                 leaf name {
 *                     type netconf-datastore-type;
 *                 }
 *                 container locks {
 *                     choice lock-type {
 *                         case global-lock {
 *                             container global-lock {
 *                                 leaf locked-by-session {
 *                                     type uint32;
 *                                 }
 *                                 leaf locked-time {
 *                                     type date-and-time;
 *                                 }
 *                                 uses netconf-state;
 *                             }
 *                         }
 *                         case partial-lock {
 *                             list partial-lock {
 *                                 key "lock-id"
 *                                 leaf lock-id {
 *                                     type uint32;
 *                                 }
 *                                 leaf locked-by-session {
 *                                     type uint32;
 *                                 }
 *                                 leaf locked-time {
 *                                     type date-and-time;
 *                                 }
 *                                 leaf-list select {
 *                                     type xpath1.0;
 *                                 }
 *                                 leaf-list locked-node {
 *                                     type instance-identifier;
 *                                 }
 *                                 uses netconf-state;
 *                             }
 *                         }
 *                     }
 *                     grouping lock-info {
 *                         leaf locked-by-session {
 *                             type uint32;
 *                         }
 *                         leaf locked-time {
 *                             type date-and-time;
 *                         }
 *                     }
 *                 }
 *             }
 *         }
 *         container schemas {
 *             list schema {
 *                 key "identifier" 
 *             "version" 
 *             "format"
 *                 leaf identifier {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 leaf format {
 *                     type identityref;
 *                 }
 *                 leaf namespace {
 *                     type uri;
 *                 }
 *                 leaf-list location {
 *                     type union;
 *                 }
 *             }
 *         }
 *         container sessions {
 *             list session {
 *                 key "session-id"
 *                 leaf session-id {
 *                     type uint32;
 *                 }
 *                 leaf transport {
 *                     type identityref;
 *                 }
 *                 leaf username {
 *                     type string;
 *                 }
 *                 leaf source-host {
 *                     type host;
 *                 }
 *                 leaf login-time {
 *                     type date-and-time;
 *                 }
 *                 leaf in-rpcs {
 *                     type zero-based-counter32;
 *                 }
 *                 leaf in-bad-rpcs {
 *                     type zero-based-counter32;
 *                 }
 *                 leaf out-rpc-errors {
 *                     type zero-based-counter32;
 *                 }
 *                 leaf out-notifications {
 *                     type zero-based-counter32;
 *                 }
 *                 uses common-counters;
 *             }
 *         }
 *         container statistics {
 *             leaf netconf-start-time {
 *                 type date-and-time;
 *             }
 *             leaf in-bad-hellos {
 *                 type zero-based-counter32;
 *             }
 *             leaf in-sessions {
 *                 type zero-based-counter32;
 *             }
 *             leaf dropped-sessions {
 *                 type zero-based-counter32;
 *             }
 *             leaf in-rpcs {
 *                 type zero-based-counter32;
 *             }
 *             leaf in-bad-rpcs {
 *                 type zero-based-counter32;
 *             }
 *             leaf out-rpc-errors {
 *                 type zero-based-counter32;
 *             }
 *             leaf out-notifications {
 *                 type zero-based-counter32;
 *             }
 *             uses common-counters;
 *         }
 *     }
 * 
 *     grouping common-counters {
 *         leaf in-rpcs {
 *             type zero-based-counter32;
 *         }
 *         leaf in-bad-rpcs {
 *             type zero-based-counter32;
 *         }
 *         leaf out-rpc-errors {
 *             type zero-based-counter32;
 *         }
 *         leaf out-notifications {
 *             type zero-based-counter32;
 *         }
 *     }
 * 
 *     identity netconf-beep {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *         description
 *             "NETCONF over Blocks Extensible Exchange Protocol (BEEP).";
 *         reference
 *             "RFC 4744: Using the NETCONF Protocol over the
 *                     	  Blocks Extensible Exchange Protocol (BEEP)";
 *         status CURRENT;
 *     }
 *     identity netconf-soap-over-beep {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *         description
 *             "NETCONF over Simple Object Access Protocol (SOAP) over
 *                    Blocks Extensible Exchange Protocol (BEEP).";
 *         reference
 *             "RFC 4743: Using NETCONF over the Simple Object
 *                     	  Access Protocol (SOAP)";
 *         status CURRENT;
 *     }
 *     identity netconf-soap-over-https {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *         description
 *             "NETCONF over Simple Object Access Protocol (SOAP)
 *                   over Hypertext Transfer Protocol Secure (HTTPS).";
 *         reference
 *             "RFC 4743: Using NETCONF over the Simple Object
 *                     	  Access Protocol (SOAP)";
 *         status CURRENT;
 *     }
 *     identity netconf-ssh {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *         description
 *             "NETCONF over Secure Shell (SSH).";
 *         reference
 *             "RFC 4742: Using the NETCONF Configuration Protocol
 *                     	  over Secure SHell (SSH)";
 *         status CURRENT;
 *     }
 *     identity netconf-tls {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)transport]";
 *         description
 *             "NETCONF over Transport Layer Security (TLS).";
 *         reference
 *             "RFC 5539: NETCONF over Transport Layer Security (TLS)";
 *         status CURRENT;
 *     }
 *     identity rnc {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)schema-format]";
 *         description
 *             "Relax NG Compact Syntax";
 *         reference
 *             "ISO/IEC 19757-2:2008: RELAX NG";
 *         status CURRENT;
 *     }
 *     identity rng {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)schema-format]";
 *         description
 *             "Regular Language for XML Next Generation (RELAX NG).";
 *         reference
 *             "ISO/IEC 19757-2:2008: RELAX NG";
 *         status CURRENT;
 *     }
 *     identity schema-format {
 *         description
 *             "Base identity for data model schema languages.";
 *         status CURRENT;
 *     }
 *     identity transport {
 *         description
 *             "Base identity for NETCONF transport types.";
 *         status CURRENT;
 *     }
 *     identity xsd {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)schema-format]";
 *         description
 *             "W3C XML Schema Definition.";
 *         reference
 *             "W3C REC REC-xmlschema-1-20041028:
 *                       XML Schema Part 1: Structures";
 *         status CURRENT;
 *     }
 *     identity yang {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)schema-format]";
 *         description
 *             "The YANG data modeling language for NETCONF.";
 *         reference
 *             "RFC 6020:  YANG - A Data Modeling Language for the
 *                     	   Network Configuration Protocol (NETCONF)";
 *         status CURRENT;
 *     }
 *     identity yin {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(urn:ietf:params:xml:ns:yang:ietf-netconf-monitoring?revision=2010-10-04)schema-format]";
 *         description
 *             "The YIN syntax for YANG.";
 *         reference
 *             "RFC 6020:  YANG - A Data Modeling Language for the
 *                     	   Network Configuration Protocol (NETCONF)";
 *         status CURRENT;
 *     }
 * 
 *     rpc get-schema {
 *         "This operation is used to retrieve a schema from the
 *                NETCONF server.
 *         
 *                Positive Response:
 *                  The NETCONF server returns the requested schema.
 *         
 *                Negative Response:
 *                  If requested schema does not exist, the <error-tag> is
 *                  'invalid-value'.
 *         
 *                  If more than one schema matches the requested parameters, the
 *                  <error-tag> is 'operation-failed', and <error-app-tag> is
 *                  'data-not-unique'.";
 *         input {
 *             leaf identifier {
 *                 type string;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *             leaf format {
 *                 type identityref;
 *             }
 *         }
 *         
 *         output {
 *             anyxml data;
 *         }
 *         status CURRENT;
 *     }
 * }
 * </pre>
 */
public interface IetfNetconfMonitoringData
    extends
    DataRoot
{




    /**
     * The netconf-state container is the root of the monitoring data model.
     */
    NetconfState getNetconfState();

}

