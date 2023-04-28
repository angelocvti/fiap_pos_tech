package com.angelocvti.dto;

import lombok.Data;

@Data
public class EnderecoResponse {
    private String rua;
    private Long numero;
    private String bairro;
    private String cidade;
    private String estado;
}
