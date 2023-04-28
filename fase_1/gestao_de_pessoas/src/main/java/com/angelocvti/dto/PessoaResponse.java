package com.angelocvti.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaResponse {
    private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String parentesco;
    private String observacoes;
}
