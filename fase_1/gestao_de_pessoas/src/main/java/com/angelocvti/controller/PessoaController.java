package com.angelocvti.controller;

import com.angelocvti.domain.Pessoa;
import com.angelocvti.dto.PessoaRequest;
import com.angelocvti.dto.PessoaResponse;
import com.angelocvti.repository.PessoaRepository;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public ResponseEntity<PessoaResponse> criarPessoa(@RequestBody @Valid final PessoaRequest pessoaRequest) {
        Pessoa pessoa = new Pessoa();

        BeanUtils.copyProperties(pessoaRequest, pessoa);

        repository.salvar(pessoa);

        PessoaResponse pessoaResponse = new PessoaResponse();

        BeanUtils.copyProperties(pessoa, pessoaResponse);
        pessoaResponse.setSexo(pessoa.getSexo().getSexo());
        pessoaResponse.setParentesco(pessoa.getParentesco().getParentesco());

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(final MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest().body(ex.getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleHttpMessageNotReadableException(final HttpMessageNotReadableException ex) {
        if (ex.getCause() instanceof InvalidFormatException ife) {
            return ResponseEntity.badRequest().body("O valor: " + ife.getValue() + " é inválido.");
        }
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
