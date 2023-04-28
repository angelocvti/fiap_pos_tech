package com.angelocvti.domain;

import lombok.Data;

@Data
public class Endereco {
    private String rua;
    private Long numero;
    private String bairro;
    private String cidade;
    private Estado estado;
}
