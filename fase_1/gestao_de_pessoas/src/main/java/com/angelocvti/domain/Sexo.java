package com.angelocvti.domain;

import lombok.Getter;

@Getter
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String sexo;

    Sexo(final String sexo) {
        this.sexo = sexo;
    }
}
