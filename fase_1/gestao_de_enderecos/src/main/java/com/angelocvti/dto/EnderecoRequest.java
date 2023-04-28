package com.angelocvti.dto;

import com.angelocvti.domain.Estado;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EnderecoRequest {
    @Size(min = 5, max = 50, message = "O nome da rua deve ter entre 5 e 50 caracteres.")
    private String rua;

    @NotNull(message = "O número do endereço deve estar presente.")
    @Positive(message = "O número do endereço deve ser um número positivo.")
    private Long numero;

    @Size(min = 5, max = 50, message = "O nome do bairro deve ter entre 5 e 50 caracteres.")
    private String bairro;

    @Size(min = 5, max = 50, message = "O nome da cidade deve ter entre 5 e 50 caracteres.")
    private String cidade;

    @NotNull(message = "O estado deve estar presente.")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    private Estado estado;
}
