package com.angelocvti.dto;

import com.angelocvti.domain.Parentesco;
import com.angelocvti.domain.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaRequest {
    @NotNull(message = "O nome deve estar presente.")
    @Size(min = 5, max = 50, message = "O nome da pessoa deve ter entre 5 e 50 caracteres.")
    private String nome;

    @NotNull(message = "A data de nascimento deve estar presente.")
    @Past(message = "A data de nascimento deve estar no passado.")
    private LocalDate dataNascimento;

    @NotNull(message = "O sexo deve estar presente.")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    private Sexo sexo;

    @NotNull(message = "O parentesco deve estar presente.")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    private Parentesco parentesco;

    @Size(max = 100, message = "O campo de dados relevantes deve ter no máximo 100 caracteres.")
    private String outrosDados;
}
