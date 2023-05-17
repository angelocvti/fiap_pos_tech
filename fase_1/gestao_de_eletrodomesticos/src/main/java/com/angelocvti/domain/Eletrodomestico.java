package com.angelocvti.domain;

import lombok.Data;

@Data
public class Eletrodomestico {
    private String nome;
    private String modelo;
    private Integer potencia; // em watts
    private String outrasInformacoes;
}