package com.angelocvti.domain;

import lombok.Getter;

@Getter
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }
}
