SUMMARY = "odin backup"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "1.0"
PR = "r5"

SRC_URI = "file://odin-backup.sh \
           "

do_install() {
    install -d ${D}${sysconfdir}/init.d
    install -d ${D}${sysconfdir}/rc3.d
    install -m 0755 ${WORKDIR}/odin-backup.sh ${D}${sysconfdir}/init.d
    ln -sf    ../init.d/odin-backup.sh ${D}${sysconfdir}/rc3.d/S30odin-backup
}


