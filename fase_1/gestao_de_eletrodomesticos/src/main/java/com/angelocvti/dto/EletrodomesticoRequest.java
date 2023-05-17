package com.angelocvti.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EletrodomesticoRequest {
    @NotNull(message = "O nome deve estar presente.")
    @Size(min = 5, max = 50, message = "O nome deve possuir entre 5 e 50 caracteres.")
    private String nome;

    @NotNull(message = "O modelo deve estar presente.")
    @Size(min = 5, max = 50, message = "O modelo deve possuir entre 5 e 50 caracteres.")
    private String modelo;

    @NotNull(message = "A potência (em watts) deve estar presente.")
    @Positive(message = "A potência (em watts) deve ser um número positivo.")
    private Integer potencia; // em watts

    @Size(max = 100, message = "O campo de outras informações deve ter no máximo 100 caracteres.")
    private String outrasInformacoes;
}
