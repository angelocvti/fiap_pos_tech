package com.angelocvti.dto;

import com.angelocvti.domain.Estado;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EnderecoRequest {
    @NotNull(message = "A rua deve estar presente.")
    @Size(min = 5, max = 50, message = "A rua deve possuir entre 5 e 50 caracteres.")
    private String rua;

    @NotNull(message = "O número deve estar presente.")
    @Positive(message = "O número deve ser um número positivo.")
    private Long numero;

    @NotNull(message = "O bairro deve estar presente.")
    @Size(min = 5, max = 50, message = "O bairro deve possuir entre 5 e 50 caracteres.")
    private String bairro;

    @NotNull(message = "A cidade deve estar presente.")
    @Size(min = 5, max = 50, message = "A cidade deve possuir entre 5 e 50 caracteres.")
    private String cidade;

    @NotNull(message = "O estado deve estar presente.")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    private Estado estado;
}
