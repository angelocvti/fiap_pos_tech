package com.angelocvti.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private Parentesco parentesco;
    private String outrosDados;
}
