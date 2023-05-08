package com.angelocvti.domain;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Eletrodomestico {
    @Size(min = 5, max = 50, message = "O nome do eletrodoméstico deve ter entre 5 e 50 caracteres.")
    private String nome;

    @Size(min = 1, max = 50, message = "O modelo do eletrodoméstico deve ter entre 5 e 50 caracteres.")
    private String modelo;

    @Positive
    private Integer potencia; // em watts

    private String outrasInformacoes;
}
