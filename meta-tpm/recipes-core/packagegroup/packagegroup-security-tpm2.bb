DESCRIPTION = "TPM2 packagegroup for Security"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "packagegroup-security-tpm2"

SUMMARY_packagegroup-security-tpm2 = "Security TPM 2.0 support"
RDEPENDS_packagegroup-security-tpm2 = " \
    tpm2.0-tools \
    trousers \
    libtss2 \
    libtss2-tcti-device \
    libtss2-tcti-mssim \
    tpm2-abrmd \
    tpm2-pkcs11 \
    cryptsetup-tpm-incubator \
    "

RDEPENDS_packagegroup-security-tpm2_append_x86 = " tpm2-tcti-uefi"
RDEPENDS_packagegroup-security-tpm2_append_x86-64 = " tpm2-tcti-uefi"
