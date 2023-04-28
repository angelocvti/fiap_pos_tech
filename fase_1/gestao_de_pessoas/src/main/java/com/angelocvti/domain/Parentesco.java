package com.angelocvti.domain;

import lombok.Getter;

@Getter
public enum Parentesco {
    PAI("Pai"),
    MAE("Mãe"),
    IRMAO("Irmão"),
    IRMA("Irmã"),
    TIO("Tio"),
    TIA("Tia"),
    PRIMO("Primo"),
    PRIMA("Prima"),
    AVO1("Avô"),
    AVO2("Avó"),
    ESPOSO("Esposo"),
    ESPOSA("Esposa"),
    NAMORADA("Namorada"),
    NAMORADO("Namorado"),
    FILHO("Filho"),
    FILHA("Filha"),
    NETO("Neto"),
    NETA("Neta");

    private final String parentesco;

    Parentesco(final String parentesco) {
        this.parentesco = parentesco;
    }
}
