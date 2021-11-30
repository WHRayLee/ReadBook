```
iMac-3:elasticsearch-7.15.2 yons$ tree .
.
├── LICENSE.txt
├── NOTICE.txt
├── README.asciidoc
├── bin
│   ├── elasticsearch
│   ├── elasticsearch-certgen
│   ├── elasticsearch-certutil
│   ├── elasticsearch-cli
│   ├── elasticsearch-croneval
│   ├── elasticsearch-env
│   ├── elasticsearch-env-from-file
│   ├── elasticsearch-geoip
│   ├── elasticsearch-keystore
│   ├── elasticsearch-migrate
│   ├── elasticsearch-node
│   ├── elasticsearch-plugin
│   ├── elasticsearch-saml-metadata
│   ├── elasticsearch-service-tokens
│   ├── elasticsearch-setup-passwords
│   ├── elasticsearch-shard
│   ├── elasticsearch-sql-cli
│   ├── elasticsearch-sql-cli-7.15.2.jar
│   ├── elasticsearch-syskeygen
│   ├── elasticsearch-users
│   ├── x-pack-env
│   ├── x-pack-security-env
│   └── x-pack-watcher-env
├── config
│   ├── elasticsearch.keystore
│   ├── elasticsearch.yml
│   ├── jvm.options
│   ├── jvm.options.d
│   ├── log4j2.properties
│   ├── role_mapping.yml
│   ├── roles.yml
│   ├── users
│   └── users_roles
├── data
│   └── nodes
│       └── 0
│           ├── _state
│           │   ├── _17.cfe
│           │   ├── _17.cfs
│           │   ├── _17.si
│           │   ├── _1h.cfe
│           │   ├── _1h.cfs
│           │   ├── _1h.si
│           │   ├── _1l.cfe
│           │   ├── _1l.cfs
│           │   ├── _1l.si
│           │   ├── _1m.cfe
│           │   ├── _1m.cfs
│           │   ├── _1m.si
│           │   ├── _1w.cfe
│           │   ├── _1w.cfs
│           │   ├── _1w.si
│           │   ├── _1w_1.liv
│           │   ├── _22.cfe
│           │   ├── _22.cfs
│           │   ├── _22.si
│           │   ├── _23.cfe
│           │   ├── _23.cfs
│           │   ├── _23.si
│           │   ├── _24.cfe
│           │   ├── _24.cfs
│           │   ├── _24.si
│           │   ├── manifest-0.st
│           │   ├── node-0.st
│           │   ├── segments_28
│           │   └── write.lock
│           ├── indices
│           │   ├── 1fGFrblsRk2l-DE-A9LHrA
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-7.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── _0.cfe
│           │   │   │   │   ├── _0.cfs
│           │   │   │   │   ├── _0.si
│           │   │   │   │   ├── _l.fdm
│           │   │   │   │   ├── _l.fdt
│           │   │   │   │   ├── _l.fdx
│           │   │   │   │   ├── _l.fnm
│           │   │   │   │   ├── _l.kdd
│           │   │   │   │   ├── _l.kdi
│           │   │   │   │   ├── _l.kdm
│           │   │   │   │   ├── _l.nvd
│           │   │   │   │   ├── _l.nvm
│           │   │   │   │   ├── _l.si
│           │   │   │   │   ├── _l_1.fnm
│           │   │   │   │   ├── _l_1_Lucene80_0.dvd
│           │   │   │   │   ├── _l_1_Lucene80_0.dvm
│           │   │   │   │   ├── _l_Lucene80_0.dvd
│           │   │   │   │   ├── _l_Lucene80_0.dvm
│           │   │   │   │   ├── _l_Lucene84_0.doc
│           │   │   │   │   ├── _l_Lucene84_0.pos
│           │   │   │   │   ├── _l_Lucene84_0.tim
│           │   │   │   │   ├── _l_Lucene84_0.tip
│           │   │   │   │   ├── _l_Lucene84_0.tmd
│           │   │   │   │   ├── _m.cfe
│           │   │   │   │   ├── _m.cfs
│           │   │   │   │   ├── _m.si
│           │   │   │   │   ├── _n.cfe
│           │   │   │   │   ├── _n.cfs
│           │   │   │   │   ├── _n.si
│           │   │   │   │   ├── _o.cfe
│           │   │   │   │   ├── _o.cfs
│           │   │   │   │   ├── _o.si
│           │   │   │   │   ├── _p.cfe
│           │   │   │   │   ├── _p.cfs
│           │   │   │   │   ├── _p.si
│           │   │   │   │   ├── _q.cfe
│           │   │   │   │   ├── _q.cfs
│           │   │   │   │   ├── _q.si
│           │   │   │   │   ├── segments_3
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-3.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-7.st
│           │   ├── GAjUFep0RkSiZcn7F6y1NQ
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-1.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── segments_2
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-2.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-1.st
│           │   ├── N0JviNHbS5Ok8v4WXecjhQ
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-1.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── segments_2
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-2.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-1.st
│           │   ├── Zp-dqbW2SKWHIe9qTBk_lQ
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-1.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── _0.cfe
│           │   │   │   │   ├── _0.cfs
│           │   │   │   │   ├── _0.si
│           │   │   │   │   ├── segments_3
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-3.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-5.st
│           │   ├── uoF05OPkRsKPktzW7dNiZw
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-1.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── _0.cfe
│           │   │   │   │   ├── _0.cfs
│           │   │   │   │   ├── _0.si
│           │   │   │   │   ├── _1.cfe
│           │   │   │   │   ├── _1.cfs
│           │   │   │   │   ├── _1.si
│           │   │   │   │   ├── _2.cfe
│           │   │   │   │   ├── _2.cfs
│           │   │   │   │   ├── _2.si
│           │   │   │   │   ├── _3.cfe
│           │   │   │   │   ├── _3.cfs
│           │   │   │   │   ├── _3.si
│           │   │   │   │   ├── _4.cfe
│           │   │   │   │   ├── _4.cfs
│           │   │   │   │   ├── _4.si
│           │   │   │   │   ├── _5.cfe
│           │   │   │   │   ├── _5.cfs
│           │   │   │   │   ├── _5.si
│           │   │   │   │   ├── segments_5
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-5.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-1.st
│           │   ├── zFYBKCetScGKIIejPAuemw
│           │   │   ├── 0
│           │   │   │   ├── _state
│           │   │   │   │   ├── retention-leases-1.st
│           │   │   │   │   └── state-0.st
│           │   │   │   ├── index
│           │   │   │   │   ├── _0.cfe
│           │   │   │   │   ├── _0.cfs
│           │   │   │   │   ├── _0.si
│           │   │   │   │   ├── _1.cfe
│           │   │   │   │   ├── _1.cfs
│           │   │   │   │   ├── _1.si
│           │   │   │   │   ├── segments_3
│           │   │   │   │   └── write.lock
│           │   │   │   └── translog
│           │   │   │       ├── translog-3.tlog
│           │   │   │       └── translog.ckp
│           │   │   └── _state
│           │   │       └── state-5.st
│           │   └── zTq8ivmWQG6AuKzOZ6J9jw
│           │       ├── 0
│           │       │   ├── _state
│           │       │   │   ├── retention-leases-22.st
│           │       │   │   └── state-0.st
│           │       │   ├── index
│           │       │   │   ├── _2t.fdm
│           │       │   │   ├── _2t.fdt
│           │       │   │   ├── _2t.fdx
│           │       │   │   ├── _2t.fnm
│           │       │   │   ├── _2t.kdd
│           │       │   │   ├── _2t.kdi
│           │       │   │   ├── _2t.kdm
│           │       │   │   ├── _2t.nvd
│           │       │   │   ├── _2t.nvm
│           │       │   │   ├── _2t.si
│           │       │   │   ├── _2t_3.fnm
│           │       │   │   ├── _2t_3_Lucene80_0.dvd
│           │       │   │   ├── _2t_3_Lucene80_0.dvm
│           │       │   │   ├── _2t_Lucene80_0.dvd
│           │       │   │   ├── _2t_Lucene80_0.dvm
│           │       │   │   ├── _2t_Lucene84_0.doc
│           │       │   │   ├── _2t_Lucene84_0.pos
│           │       │   │   ├── _2t_Lucene84_0.tim
│           │       │   │   ├── _2t_Lucene84_0.tip
│           │       │   │   ├── _2t_Lucene84_0.tmd
│           │       │   │   ├── _47.fdm
│           │       │   │   ├── _47.fdt
│           │       │   │   ├── _47.fdx
│           │       │   │   ├── _47.fnm
│           │       │   │   ├── _47.kdd
│           │       │   │   ├── _47.kdi
│           │       │   │   ├── _47.kdm
│           │       │   │   ├── _47.nvd
│           │       │   │   ├── _47.nvm
│           │       │   │   ├── _47.si
│           │       │   │   ├── _47_2.fnm
│           │       │   │   ├── _47_2_Lucene80_0.dvd
│           │       │   │   ├── _47_2_Lucene80_0.dvm
│           │       │   │   ├── _47_Lucene80_0.dvd
│           │       │   │   ├── _47_Lucene80_0.dvm
│           │       │   │   ├── _47_Lucene84_0.doc
│           │       │   │   ├── _47_Lucene84_0.pos
│           │       │   │   ├── _47_Lucene84_0.tim
│           │       │   │   ├── _47_Lucene84_0.tip
│           │       │   │   ├── _47_Lucene84_0.tmd
│           │       │   │   ├── _48.cfe
│           │       │   │   ├── _48.cfs
│           │       │   │   ├── _48.si
│           │       │   │   ├── _48_1.fnm
│           │       │   │   ├── _48_1_Lucene80_0.dvd
│           │       │   │   ├── _48_1_Lucene80_0.dvm
│           │       │   │   ├── _49.cfe
│           │       │   │   ├── _49.cfs
│           │       │   │   ├── _49.si
│           │       │   │   ├── _49_1.fnm
│           │       │   │   ├── _49_1_Lucene80_0.dvd
│           │       │   │   ├── _49_1_Lucene80_0.dvm
│           │       │   │   ├── _4a.cfe
│           │       │   │   ├── _4a.cfs
│           │       │   │   ├── _4a.si
│           │       │   │   ├── _4a_2.fnm
│           │       │   │   ├── _4a_2_Lucene80_0.dvd
│           │       │   │   ├── _4a_2_Lucene80_0.dvm
│           │       │   │   ├── _4b.cfe
│           │       │   │   ├── _4b.cfs
│           │       │   │   ├── _4b.si
│           │       │   │   ├── _4b_1.fnm
│           │       │   │   ├── _4b_1_Lucene80_0.dvd
│           │       │   │   ├── _4b_1_Lucene80_0.dvm
│           │       │   │   ├── _4c.cfe
│           │       │   │   ├── _4c.cfs
│           │       │   │   ├── _4c.si
│           │       │   │   ├── _4c_2.fnm
│           │       │   │   ├── _4c_2_Lucene80_0.dvd
│           │       │   │   ├── _4c_2_Lucene80_0.dvm
│           │       │   │   ├── _4d.cfe
│           │       │   │   ├── _4d.cfs
│           │       │   │   ├── _4d.si
│           │       │   │   ├── _4e.fdm
│           │       │   │   ├── _4e.fdt
│           │       │   │   ├── _4e_Lucene85FieldsIndex-doc_ids_8s.tmp
│           │       │   │   ├── _4e_Lucene85FieldsIndexfile_pointers_8t.tmp
│           │       │   │   ├── segments_2
│           │       │   │   └── write.lock
│           │       │   └── translog
│           │       │       ├── translog-2.tlog
│           │       │       └── translog.ckp
│           │       └── _state
│           │           └── state-3.st
│           ├── node.lock
│           └── snapshot_cache
│               ├── segments_1
│               └── write.lock
├── jdk.app
│   └── Contents
│       ├── CodeResources
│       ├── Home
│       │   ├── NOTICE
│       │   ├── bin
│       │   │   ├── jar
│       │   │   ├── jarsigner
│       │   │   ├── java
│       │   │   ├── javac
│       │   │   ├── javadoc
│       │   │   ├── javap
│       │   │   ├── jcmd
│       │   │   ├── jconsole
│       │   │   ├── jdb
│       │   │   ├── jdeprscan
│       │   │   ├── jdeps
│       │   │   ├── jfr
│       │   │   ├── jhsdb
│       │   │   ├── jimage
│       │   │   ├── jinfo
│       │   │   ├── jlink
│       │   │   ├── jmap
│       │   │   ├── jmod
│       │   │   ├── jpackage
│       │   │   ├── jps
│       │   │   ├── jrunscript
│       │   │   ├── jshell
│       │   │   ├── jstack
│       │   │   ├── jstat
│       │   │   ├── jstatd
│       │   │   ├── keytool
│       │   │   ├── rmiregistry
│       │   │   └── serialver
│       │   ├── bundle
│       │   │   └── Libraries
│       │   │       └── libserver.dylib
│       │   ├── conf
│       │   │   ├── logging.properties
│       │   │   ├── management
│       │   │   │   ├── jmxremote.access
│       │   │   │   ├── jmxremote.password.template
│       │   │   │   └── management.properties
│       │   │   ├── net.properties
│       │   │   ├── security
│       │   │   │   ├── java.policy
│       │   │   │   ├── java.security
│       │   │   │   └── policy
│       │   │   │       ├── README.txt
│       │   │   │       ├── limited
│       │   │   │       │   ├── default_US_export.policy
│       │   │   │       │   ├── default_local.policy
│       │   │   │       │   └── exempt_local.policy
│       │   │   │       └── unlimited
│       │   │   │           ├── default_US_export.policy
│       │   │   │           └── default_local.policy
│       │   │   └── sound.properties
│       │   ├── include
│       │   │   ├── classfile_constants.h
│       │   │   ├── darwin
│       │   │   │   ├── jawt_md.h
│       │   │   │   └── jni_md.h
│       │   │   ├── jawt.h
│       │   │   ├── jdwpTransport.h
│       │   │   ├── jni.h
│       │   │   ├── jvmti.h
│       │   │   └── jvmticmlr.h
│       │   ├── jmods
│       │   │   ├── java.base.jmod
│       │   │   ├── java.compiler.jmod
│       │   │   ├── java.datatransfer.jmod
│       │   │   ├── java.desktop.jmod
│       │   │   ├── java.instrument.jmod
│       │   │   ├── java.logging.jmod
│       │   │   ├── java.management.jmod
│       │   │   ├── java.management.rmi.jmod
│       │   │   ├── java.naming.jmod
│       │   │   ├── java.net.http.jmod
│       │   │   ├── java.prefs.jmod
│       │   │   ├── java.rmi.jmod
│       │   │   ├── java.scripting.jmod
│       │   │   ├── java.se.jmod
│       │   │   ├── java.security.jgss.jmod
│       │   │   ├── java.security.sasl.jmod
│       │   │   ├── java.smartcardio.jmod
│       │   │   ├── java.sql.jmod
│       │   │   ├── java.sql.rowset.jmod
│       │   │   ├── java.transaction.xa.jmod
│       │   │   ├── java.xml.crypto.jmod
│       │   │   ├── java.xml.jmod
│       │   │   ├── jdk.accessibility.jmod
│       │   │   ├── jdk.attach.jmod
│       │   │   ├── jdk.charsets.jmod
│       │   │   ├── jdk.compiler.jmod
│       │   │   ├── jdk.crypto.cryptoki.jmod
│       │   │   ├── jdk.crypto.ec.jmod
│       │   │   ├── jdk.dynalink.jmod
│       │   │   ├── jdk.editpad.jmod
│       │   │   ├── jdk.hotspot.agent.jmod
│       │   │   ├── jdk.httpserver.jmod
│       │   │   ├── jdk.incubator.foreign.jmod
│       │   │   ├── jdk.incubator.vector.jmod
│       │   │   ├── jdk.internal.ed.jmod
│       │   │   ├── jdk.internal.jvmstat.jmod
│       │   │   ├── jdk.internal.le.jmod
│       │   │   ├── jdk.internal.opt.jmod
│       │   │   ├── jdk.internal.vm.ci.jmod
│       │   │   ├── jdk.internal.vm.compiler.jmod
│       │   │   ├── jdk.internal.vm.compiler.management.jmod
│       │   │   ├── jdk.jartool.jmod
│       │   │   ├── jdk.javadoc.jmod
│       │   │   ├── jdk.jcmd.jmod
│       │   │   ├── jdk.jconsole.jmod
│       │   │   ├── jdk.jdeps.jmod
│       │   │   ├── jdk.jdi.jmod
│       │   │   ├── jdk.jdwp.agent.jmod
│       │   │   ├── jdk.jfr.jmod
│       │   │   ├── jdk.jlink.jmod
│       │   │   ├── jdk.jpackage.jmod
│       │   │   ├── jdk.jshell.jmod
│       │   │   ├── jdk.jsobject.jmod
│       │   │   ├── jdk.jstatd.jmod
│       │   │   ├── jdk.localedata.jmod
│       │   │   ├── jdk.management.agent.jmod
│       │   │   ├── jdk.management.jfr.jmod
│       │   │   ├── jdk.management.jmod
│       │   │   ├── jdk.naming.dns.jmod
│       │   │   ├── jdk.naming.rmi.jmod
│       │   │   ├── jdk.net.jmod
│       │   │   ├── jdk.nio.mapmode.jmod
│       │   │   ├── jdk.random.jmod
│       │   │   ├── jdk.sctp.jmod
│       │   │   ├── jdk.security.auth.jmod
│       │   │   ├── jdk.security.jgss.jmod
│       │   │   ├── jdk.unsupported.desktop.jmod
│       │   │   ├── jdk.unsupported.jmod
│       │   │   ├── jdk.xml.dom.jmod
│       │   │   └── jdk.zipfs.jmod
│       │   ├── legal
│       │   │   ├── java.base
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── aes.md
│       │   │   │   ├── asm.md
│       │   │   │   ├── c-libutl.md
│       │   │   │   ├── cldr.md
│       │   │   │   ├── icu.md
│       │   │   │   ├── public_suffix.md
│       │   │   │   └── unicode.md
│       │   │   ├── java.compiler
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.datatransfer
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.desktop
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── colorimaging.md
│       │   │   │   ├── freetype.md
│       │   │   │   ├── giflib.md
│       │   │   │   ├── harfbuzz.md
│       │   │   │   ├── jpeg.md
│       │   │   │   ├── lcms.md
│       │   │   │   ├── libpng.md
│       │   │   │   ├── mesa3d.md
│       │   │   │   └── xwd.md
│       │   │   ├── java.instrument
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.logging
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.management
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.management.rmi
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.naming
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.net.http
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.prefs
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.rmi
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.scripting
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.se
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.security.jgss
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.security.sasl
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.smartcardio
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   └── pcsclite.md
│       │   │   ├── java.sql
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.sql.rowset
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.transaction.xa
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── java.xml
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── bcel.md
│       │   │   │   ├── dom.md
│       │   │   │   ├── jcup.md
│       │   │   │   ├── xalan.md
│       │   │   │   └── xerces.md
│       │   │   ├── java.xml.crypto
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   └── santuario.md
│       │   │   ├── jdk.accessibility
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.attach
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.charsets
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.compiler
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.crypto.cryptoki
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── pkcs11cryptotoken.md
│       │   │   │   └── pkcs11wrapper.md
│       │   │   ├── jdk.crypto.ec
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.dynalink
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   └── dynalink.md
│       │   │   ├── jdk.editpad
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.hotspot.agent
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.httpserver
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.incubator.foreign
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.incubator.vector
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.internal.ed
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.internal.jvmstat
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.internal.le
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   └── jline.md
│       │   │   ├── jdk.internal.opt
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   └── jopt-simple.md
│       │   │   ├── jdk.internal.vm.ci
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.internal.vm.compiler
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.internal.vm.compiler.management
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jartool
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.javadoc
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── jquery.md
│       │   │   │   └── jqueryUI.md
│       │   │   ├── jdk.jcmd
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jconsole
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jdeps
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jdi
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jdwp.agent
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jfr
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jlink
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jpackage
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jshell
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jsobject
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.jstatd
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.localedata
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   ├── LICENSE
│       │   │   │   ├── cldr.md
│       │   │   │   └── thaidict.md
│       │   │   ├── jdk.management
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.management.agent
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.management.jfr
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.naming.dns
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.naming.rmi
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.net
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.nio.mapmode
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.random
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.sctp
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.security.auth
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.security.jgss
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.unsupported
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.unsupported.desktop
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   ├── jdk.xml.dom
│       │   │   │   ├── ADDITIONAL_LICENSE_INFO
│       │   │   │   ├── ASSEMBLY_EXCEPTION
│       │   │   │   └── LICENSE
│       │   │   └── jdk.zipfs
│       │   │       ├── ADDITIONAL_LICENSE_INFO
│       │   │       ├── ASSEMBLY_EXCEPTION
│       │   │       └── LICENSE
│       │   ├── lib
│       │   │   ├── classlist
│       │   │   ├── ct.sym
│       │   │   ├── fontconfig.bfc
│       │   │   ├── fontconfig.properties.src
│       │   │   ├── jfr
│       │   │   │   ├── default.jfc
│       │   │   │   └── profile.jfc
│       │   │   ├── jrt-fs.jar
│       │   │   ├── jspawnhelper
│       │   │   ├── jvm.cfg
│       │   │   ├── libattach.dylib
│       │   │   ├── libawt.dylib
│       │   │   ├── libawt_lwawt.dylib
│       │   │   ├── libdt_socket.dylib
│       │   │   ├── libextnet.dylib
│       │   │   ├── libfontmanager.dylib
│       │   │   ├── libfreetype.dylib
│       │   │   ├── libinstrument.dylib
│       │   │   ├── libj2gss.dylib
│       │   │   ├── libj2pcsc.dylib
│       │   │   ├── libj2pkcs11.dylib
│       │   │   ├── libjaas.dylib
│       │   │   ├── libjava.dylib
│       │   │   ├── libjavajpeg.dylib
│       │   │   ├── libjawt.dylib
│       │   │   ├── libjdwp.dylib
│       │   │   ├── libjimage.dylib
│       │   │   ├── libjli.dylib
│       │   │   ├── libjsig.dylib
│       │   │   ├── libjsound.dylib
│       │   │   ├── liblcms.dylib
│       │   │   ├── libmanagement.dylib
│       │   │   ├── libmanagement_agent.dylib
│       │   │   ├── libmanagement_ext.dylib
│       │   │   ├── libmlib_image.dylib
│       │   │   ├── libnet.dylib
│       │   │   ├── libnio.dylib
│       │   │   ├── libosx.dylib
│       │   │   ├── libosxapp.dylib
│       │   │   ├── libosxkrb5.dylib
│       │   │   ├── libosxsecurity.dylib
│       │   │   ├── libosxui.dylib
│       │   │   ├── libprefs.dylib
│       │   │   ├── librmi.dylib
│       │   │   ├── libsaproc.dylib
│       │   │   ├── libsplashscreen.dylib
│       │   │   ├── libsyslookup.dylib
│       │   │   ├── libverify.dylib
│       │   │   ├── libzip.dylib
│       │   │   ├── modules
│       │   │   ├── psfont.properties.ja
│       │   │   ├── psfontj2d.properties
│       │   │   ├── security
│       │   │   │   ├── blocked.certs
│       │   │   │   ├── cacerts
│       │   │   │   ├── default.policy
│       │   │   │   └── public_suffix_list.dat
│       │   │   ├── server
│       │   │   │   ├── classes.jsa
│       │   │   │   ├── classes_nocoops.jsa
│       │   │   │   ├── libjsig.dylib
│       │   │   │   └── libjvm.dylib
│       │   │   ├── shaders.metallib
│       │   │   └── tzdb.dat
│       │   ├── man
│       │   │   └── man1
│       │   │       ├── jar.1
│       │   │       ├── jarsigner.1
│       │   │       ├── java.1
│       │   │       ├── javac.1
│       │   │       ├── javadoc.1
│       │   │       ├── javap.1
│       │   │       ├── jcmd.1
│       │   │       ├── jconsole.1
│       │   │       ├── jdb.1
│       │   │       ├── jdeprscan.1
│       │   │       ├── jdeps.1
│       │   │       ├── jfr.1
│       │   │       ├── jhsdb.1
│       │   │       ├── jinfo.1
│       │   │       ├── jlink.1
│       │   │       ├── jmap.1
│       │   │       ├── jmod.1
│       │   │       ├── jpackage.1
│       │   │       ├── jps.1
│       │   │       ├── jrunscript.1
│       │   │       ├── jshell.1
│       │   │       ├── jstack.1
│       │   │       ├── jstat.1
│       │   │       ├── jstatd.1
│       │   │       ├── keytool.1
│       │   │       ├── rmiregistry.1
│       │   │       └── serialver.1
│       │   └── release
│       ├── Info.plist
│       └── _CodeSignature
│           ├── CodeDirectory
│           ├── CodeRequirements
│           ├── CodeRequirements-1
│           ├── CodeResources
│           └── CodeSignature
├── lib
│   ├── HdrHistogram-2.1.9.jar
│   ├── elasticsearch-7.15.2.jar
│   ├── elasticsearch-cli-7.15.2.jar
│   ├── elasticsearch-core-7.15.2.jar
│   ├── elasticsearch-geo-7.15.2.jar
│   ├── elasticsearch-launchers-7.15.2.jar
│   ├── elasticsearch-plugin-classloader-7.15.2.jar
│   ├── elasticsearch-secure-sm-7.15.2.jar
│   ├── elasticsearch-x-content-7.15.2.jar
│   ├── hppc-0.8.1.jar
│   ├── jackson-core-2.10.4.jar
│   ├── jackson-dataformat-cbor-2.10.4.jar
│   ├── jackson-dataformat-smile-2.10.4.jar
│   ├── jackson-dataformat-yaml-2.10.4.jar
│   ├── java-version-checker-7.15.2.jar
│   ├── jna-5.7.0-1.jar
│   ├── joda-time-2.10.10.jar
│   ├── jopt-simple-5.0.2.jar
│   ├── jts-core-1.15.0.jar
│   ├── log4j-api-2.11.1.jar
│   ├── log4j-core-2.11.1.jar
│   ├── lucene-analyzers-common-8.9.0.jar
│   ├── lucene-backward-codecs-8.9.0.jar
│   ├── lucene-core-8.9.0.jar
│   ├── lucene-grouping-8.9.0.jar
│   ├── lucene-highlighter-8.9.0.jar
│   ├── lucene-join-8.9.0.jar
│   ├── lucene-memory-8.9.0.jar
│   ├── lucene-misc-8.9.0.jar
│   ├── lucene-queries-8.9.0.jar
│   ├── lucene-queryparser-8.9.0.jar
│   ├── lucene-sandbox-8.9.0.jar
│   ├── lucene-spatial-extras-8.9.0.jar
│   ├── lucene-spatial3d-8.9.0.jar
│   ├── lucene-suggest-8.9.0.jar
│   ├── lz4-java-1.8.0.jar
│   ├── snakeyaml-1.26.jar
│   ├── spatial4j-0.7.jar
│   ├── t-digest-3.2.jar
│   └── tools
│       ├── geoip-cli
│       │   └── elasticsearch-geoip-cli-7.15.2.jar
│       ├── keystore-cli
│       │   └── keystore-cli-7.15.2.jar
│       ├── plugin-cli
│       │   ├── bc-fips-1.0.2.jar
│       │   ├── bcpg-fips-1.0.4.jar
│       │   ├── elasticsearch-plugin-cli-7.15.2.jar
│       │   ├── jackson-annotations-2.10.4.jar
│       │   ├── jackson-core-2.10.4.jar
│       │   ├── jackson-databind-2.10.4.jar
│       │   └── jackson-dataformat-yaml-2.10.4.jar
│       └── security-cli
│           ├── bcpkix-jdk15on-1.64.jar
│           ├── bcprov-jdk15on-1.64.jar
│           └── elasticsearch-security-cli-7.15.2.jar
├── logs
│   ├── elasticsearch.log
│   ├── elasticsearch_audit.json
│   ├── elasticsearch_deprecation.json
│   ├── elasticsearch_deprecation.log
│   ├── elasticsearch_index_indexing_slowlog.json
│   ├── elasticsearch_index_indexing_slowlog.log
│   ├── elasticsearch_index_search_slowlog.json
│   ├── elasticsearch_index_search_slowlog.log
│   ├── elasticsearch_server.json
│   ├── gc.log
│   └── gc.log.00
├── modules
│   ├── aggs-matrix-stats
│   │   ├── aggs-matrix-stats-client-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── analysis-common
│   │   ├── analysis-common-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── constant-keyword
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── constant-keyword-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── frozen-indices
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── frozen-indices-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── ingest-common
│   │   ├── elasticsearch-dissect-7.15.2.jar
│   │   ├── elasticsearch-grok-7.15.2.jar
│   │   ├── httpclient-4.5.10.jar
│   │   ├── httpcore-4.4.12.jar
│   │   ├── ingest-common-7.15.2.jar
│   │   ├── jcodings-1.0.44.jar
│   │   ├── joni-2.1.29.jar
│   │   └── plugin-descriptor.properties
│   ├── ingest-geoip
│   │   ├── GeoLite2-ASN.mmdb
│   │   ├── GeoLite2-City.mmdb
│   │   ├── GeoLite2-Country.mmdb
│   │   ├── geoip2-2.13.1.jar
│   │   ├── ingest-geoip-7.15.2.jar
│   │   ├── jackson-annotations-2.10.4.jar
│   │   ├── jackson-databind-2.10.4.jar
│   │   ├── maxmind-db-1.3.1.jar
│   │   ├── plugin-descriptor.properties
│   │   └── plugin-security.policy
│   ├── ingest-user-agent
│   │   ├── ingest-user-agent-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── kibana
│   │   ├── commons-codec-1.11.jar
│   │   ├── commons-logging-1.1.3.jar
│   │   ├── elasticsearch-rest-client-7.15.2.jar
│   │   ├── elasticsearch-ssl-config-7.15.2.jar
│   │   ├── httpasyncclient-4.1.4.jar
│   │   ├── httpclient-4.5.10.jar
│   │   ├── httpcore-4.4.12.jar
│   │   ├── httpcore-nio-4.4.12.jar
│   │   ├── kibana-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   └── reindex-client-7.15.2.jar
│   ├── lang-expression
│   │   ├── antlr4-runtime-4.5.1-1.jar
│   │   ├── asm-5.0.4.jar
│   │   ├── asm-commons-5.0.4.jar
│   │   ├── asm-tree-5.0.4.jar
│   │   ├── lang-expression-7.15.2.jar
│   │   ├── lucene-expressions-8.9.0.jar
│   │   ├── plugin-descriptor.properties
│   │   └── plugin-security.policy
│   ├── lang-mustache
│   │   ├── compiler-0.9.6.jar
│   │   ├── lang-mustache-client-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   └── plugin-security.policy
│   ├── lang-painless
│   │   ├── antlr4-runtime-4.5.3.jar
│   │   ├── asm-7.2.jar
│   │   ├── asm-analysis-7.2.jar
│   │   ├── asm-commons-7.2.jar
│   │   ├── asm-tree-7.2.jar
│   │   ├── asm-util-7.2.jar
│   │   ├── lang-painless-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── spi
│   │       └── elasticsearch-scripting-painless-spi-7.15.2.jar
│   ├── mapper-extras
│   │   ├── mapper-extras-client-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── mapper-version
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── mapper-version-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── parent-join
│   │   ├── parent-join-client-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── percolator
│   │   ├── percolator-client-7.15.2.jar
│   │   └── plugin-descriptor.properties
│   ├── rank-eval
│   │   ├── plugin-descriptor.properties
│   │   └── rank-eval-client-7.15.2.jar
│   ├── reindex
│   │   ├── commons-codec-1.11.jar
│   │   ├── commons-logging-1.1.3.jar
│   │   ├── elasticsearch-rest-client-7.15.2.jar
│   │   ├── elasticsearch-ssl-config-7.15.2.jar
│   │   ├── httpasyncclient-4.1.4.jar
│   │   ├── httpclient-4.5.10.jar
│   │   ├── httpcore-4.4.12.jar
│   │   ├── httpcore-nio-4.4.12.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── reindex-client-7.15.2.jar
│   ├── repositories-metering-api
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── repositories-metering-api-7.15.2.jar
│   ├── repository-encrypted
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── repository-encrypted-7.15.2.jar
│   ├── repository-url
│   │   ├── commons-codec-1.11.jar
│   │   ├── commons-logging-1.1.3.jar
│   │   ├── httpclient-4.5.10.jar
│   │   ├── httpcore-4.4.12.jar
│   │   ├── log4j-1.2-api-2.11.1.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── repository-url-7.15.2.jar
│   ├── runtime-fields-common
│   │   ├── elasticsearch-dissect-7.15.2.jar
│   │   ├── elasticsearch-grok-7.15.2.jar
│   │   ├── jcodings-1.0.44.jar
│   │   ├── joni-2.1.29.jar
│   │   ├── plugin-descriptor.properties
│   │   └── runtime-fields-common-7.15.2.jar
│   ├── search-business-rules
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── search-business-rules-7.15.2.jar
│   ├── searchable-snapshots
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── preallocate-7.15.2.jar
│   │   └── searchable-snapshots-7.15.2.jar
│   ├── snapshot-repo-test-kit
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── snapshot-repo-test-kit-7.15.2.jar
│   ├── spatial
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── geo-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   └── spatial-7.15.2.jar
│   ├── transform
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── transform-7.15.2.jar
│   ├── transport-netty4
│   │   ├── netty-buffer-4.1.66.Final.jar
│   │   ├── netty-codec-4.1.66.Final.jar
│   │   ├── netty-codec-http-4.1.66.Final.jar
│   │   ├── netty-common-4.1.66.Final.jar
│   │   ├── netty-handler-4.1.66.Final.jar
│   │   ├── netty-resolver-4.1.66.Final.jar
│   │   ├── netty-transport-4.1.66.Final.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── transport-netty4-client-7.15.2.jar
│   ├── unsigned-long
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── unsigned-long-7.15.2.jar
│   ├── vector-tile
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── log4j-slf4j-impl-2.11.1.jar
│   │   ├── mapbox-vector-tile-3.1.0.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── protobuf-java-3.14.0.jar
│   │   ├── slf4j-api-1.6.2.jar
│   │   └── vector-tile-7.15.2.jar
│   ├── vectors
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── vectors-7.15.2.jar
│   ├── wildcard
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── wildcard-7.15.2.jar
│   ├── x-pack-aggregate-metric
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-aggregate-metric-7.15.2.jar
│   ├── x-pack-analytics
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── commons-math3-3.6.1.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-analytics-7.15.2.jar
│   ├── x-pack-async
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-async-7.15.2.jar
│   ├── x-pack-async-search
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-async-search-7.15.2.jar
│   ├── x-pack-autoscaling
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-autoscaling-7.15.2.jar
│   ├── x-pack-ccr
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-ccr-7.15.2.jar
│   ├── x-pack-core
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── commons-codec-1.11.jar
│   │   ├── commons-logging-1.1.3.jar
│   │   ├── elasticsearch-nio-7.15.2.jar
│   │   ├── elasticsearch-ssl-config-7.15.2.jar
│   │   ├── httpasyncclient-4.1.4.jar
│   │   ├── httpclient-4.5.10.jar
│   │   ├── httpcore-4.4.12.jar
│   │   ├── httpcore-nio-4.4.12.jar
│   │   ├── log4j-1.2-api-2.11.1.jar
│   │   ├── netty-buffer-4.1.66.Final.jar
│   │   ├── netty-codec-4.1.66.Final.jar
│   │   ├── netty-codec-http-4.1.66.Final.jar
│   │   ├── netty-common-4.1.66.Final.jar
│   │   ├── netty-handler-4.1.66.Final.jar
│   │   ├── netty-resolver-4.1.66.Final.jar
│   │   ├── netty-transport-4.1.66.Final.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── transport-netty4-client-7.15.2.jar
│   │   ├── transport-nio-client-7.15.2.jar
│   │   ├── unboundid-ldapsdk-4.0.8.jar
│   │   └── x-pack-core-7.15.2.jar
│   ├── x-pack-data-streams
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-data-streams-7.15.2.jar
│   ├── x-pack-deprecation
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── elasticsearch-rest-client-7.15.2.jar
│   │   ├── elasticsearch-rest-client-sniffer-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── x-pack-deprecation-7.15.2.jar
│   │   └── x-pack-monitoring-7.15.2.jar
│   ├── x-pack-enrich
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── elasticsearch-rest-client-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── reindex-client-7.15.2.jar
│   │   └── x-pack-enrich-7.15.2.jar
│   ├── x-pack-eql
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-eql-7.15.2.jar
│   ├── x-pack-fleet
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-fleet-7.15.2.jar
│   ├── x-pack-graph
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-graph-7.15.2.jar
│   ├── x-pack-identity-provider
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── cryptacular-1.2.4.jar
│   │   ├── guava-19.0.jar
│   │   ├── httpclient-cache-4.5.10.jar
│   │   ├── java-support-7.5.1.jar
│   │   ├── log4j-slf4j-impl-2.11.1.jar
│   │   ├── metrics-core-3.2.2.jar
│   │   ├── opensaml-core-3.4.5.jar
│   │   ├── opensaml-messaging-api-3.4.5.jar
│   │   ├── opensaml-messaging-impl-3.4.5.jar
│   │   ├── opensaml-profile-api-3.4.5.jar
│   │   ├── opensaml-profile-impl-3.4.5.jar
│   │   ├── opensaml-saml-api-3.4.5.jar
│   │   ├── opensaml-saml-impl-3.4.5.jar
│   │   ├── opensaml-security-api-3.4.5.jar
│   │   ├── opensaml-security-impl-3.4.5.jar
│   │   ├── opensaml-soap-api-3.4.5.jar
│   │   ├── opensaml-soap-impl-3.4.5.jar
│   │   ├── opensaml-storage-api-3.4.5.jar
│   │   ├── opensaml-storage-impl-3.4.5.jar
│   │   ├── opensaml-xmlsec-api-3.4.5.jar
│   │   ├── opensaml-xmlsec-impl-3.4.5.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── slf4j-api-1.6.2.jar
│   │   ├── x-pack-identity-provider-7.15.2.jar
│   │   └── xmlsec-2.1.4.jar
│   ├── x-pack-ilm
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-ilm-7.15.2.jar
│   ├── x-pack-logstash
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-logstash-7.15.2.jar
│   ├── x-pack-ml
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── commons-math3-3.6.1.jar
│   │   ├── elasticsearch-grok-7.15.2.jar
│   │   ├── jcodings-1.0.44.jar
│   │   ├── joni-2.1.29.jar
│   │   ├── platform
│   │   │   └── darwin-x86_64
│   │   │       └── controller.app
│   │   │           └── Contents
│   │   │               ├── CodeResources
│   │   │               ├── Info.plist
│   │   │               ├── MacOS
│   │   │               │   ├── autodetect
│   │   │               │   ├── categorize
│   │   │               │   ├── controller
│   │   │               │   ├── data_frame_analyzer
│   │   │               │   └── normalize
│   │   │               ├── Resources
│   │   │               │   └── ml-en.dict
│   │   │               ├── _CodeSignature
│   │   │               │   └── CodeResources
│   │   │               └── lib
│   │   │                   ├── libMlApi.dylib
│   │   │                   ├── libMlCore.dylib
│   │   │                   ├── libMlMaths.dylib
│   │   │                   ├── libMlModel.dylib
│   │   │                   ├── libboost_atomic-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_chrono-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_date_time-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_filesystem-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_iostreams-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_log-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_log_setup-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_program_options-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_regex-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   ├── libboost_system-clang-darwin80-mt-x64-1_71.dylib
│   │   │                   └── libboost_thread-clang-darwin80-mt-x64-1_71.dylib
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security-test.policy
│   │   ├── plugin-security.policy
│   │   ├── super-csv-2.4.0.jar
│   │   └── x-pack-ml-7.15.2.jar
│   ├── x-pack-monitoring
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── elasticsearch-rest-client-7.15.2.jar
│   │   ├── elasticsearch-rest-client-sniffer-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   └── x-pack-monitoring-7.15.2.jar
│   ├── x-pack-ql
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── antlr4-runtime-4.9.2.jar
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-ql-7.15.2.jar
│   ├── x-pack-rollup
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-rollup-7.15.2.jar
│   ├── x-pack-security
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── accessors-smart-2.4.2.jar
│   │   ├── asm-9.1.jar
│   │   ├── cryptacular-1.2.4.jar
│   │   ├── guava-19.0.jar
│   │   ├── httpclient-cache-4.5.10.jar
│   │   ├── jakarta.mail-1.6.3.jar
│   │   ├── java-support-7.5.1.jar
│   │   ├── jcip-annotations-1.0.jar
│   │   ├── json-smart-2.4.2.jar
│   │   ├── lang-tag-1.4.4.jar
│   │   ├── log4j-slf4j-impl-2.11.1.jar
│   │   ├── metrics-core-3.2.2.jar
│   │   ├── nimbus-jose-jwt-9.8.1.jar
│   │   ├── oauth2-oidc-sdk-9.3.1.jar
│   │   ├── opensaml-core-3.4.5.jar
│   │   ├── opensaml-messaging-api-3.4.5.jar
│   │   ├── opensaml-messaging-impl-3.4.5.jar
│   │   ├── opensaml-profile-api-3.4.5.jar
│   │   ├── opensaml-profile-impl-3.4.5.jar
│   │   ├── opensaml-saml-api-3.4.5.jar
│   │   ├── opensaml-saml-impl-3.4.5.jar
│   │   ├── opensaml-security-api-3.4.5.jar
│   │   ├── opensaml-security-impl-3.4.5.jar
│   │   ├── opensaml-soap-api-3.4.5.jar
│   │   ├── opensaml-soap-impl-3.4.5.jar
│   │   ├── opensaml-storage-api-3.4.5.jar
│   │   ├── opensaml-storage-impl-3.4.5.jar
│   │   ├── opensaml-xmlsec-api-3.4.5.jar
│   │   ├── opensaml-xmlsec-impl-3.4.5.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── slf4j-api-1.6.2.jar
│   │   ├── x-pack-security-7.15.2.jar
│   │   └── xmlsec-2.1.4.jar
│   ├── x-pack-shutdown
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-shutdown-7.15.2.jar
│   ├── x-pack-sql
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── aggs-matrix-stats-client-7.15.2.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── plugin-security.policy
│   │   ├── sql-action-7.15.2.jar
│   │   ├── sql-proto-7.15.2.jar
│   │   └── x-pack-sql-7.15.2.jar
│   ├── x-pack-stack
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-stack-7.15.2.jar
│   ├── x-pack-text-structure
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── elasticsearch-grok-7.15.2.jar
│   │   ├── icu4j-62.1.jar
│   │   ├── jcodings-1.0.44.jar
│   │   ├── joni-2.1.29.jar
│   │   ├── plugin-descriptor.properties
│   │   ├── super-csv-2.4.0.jar
│   │   └── x-pack-text-structure-7.15.2.jar
│   ├── x-pack-voting-only-node
│   │   ├── LICENSE.txt
│   │   ├── NOTICE.txt
│   │   ├── plugin-descriptor.properties
│   │   └── x-pack-voting-only-node-7.15.2.jar
│   └── x-pack-watcher
│       ├── LICENSE.txt
│       ├── NOTICE.txt
│       ├── failureaccess-1.0.1.jar
│       ├── guava-27.1-jre.jar
│       ├── jakarta.activation-1.2.1.jar
│       ├── jakarta.mail-1.6.4.jar
│       ├── owasp-java-html-sanitizer-20191001.1.jar
│       ├── plugin-descriptor.properties
│       ├── plugin-security.policy
│       └── x-pack-watcher-7.15.2.jar
└── plugins

220 directories, 1191 files
```