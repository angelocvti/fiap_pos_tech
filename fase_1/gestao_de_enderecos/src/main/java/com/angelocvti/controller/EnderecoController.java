package com.angelocvti.controller;

import com.angelocvti.domain.Endereco;
import com.angelocvti.dto.EnderecoRequest;
import com.angelocvti.dto.EnderecoResponse;
import com.angelocvti.repository.EnderecoRepository;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import jakarta.validation.Valid;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoRepository repository;

    @PostMapping
    public ResponseEntity<EnderecoResponse> criarEndereco(@RequestBody @Valid final EnderecoRequest enderecoRequest) {
        Endereco endereco = new Endereco();

        BeanUtils.copyProperties(enderecoRequest, endereco);

        repository.salvar(endereco);

        EnderecoResponse enderecoResponse = new EnderecoResponse();

        BeanUtils.copyProperties(endereco, enderecoResponse);
        enderecoResponse.setEstado(endereco.getEstado().getNome() + " (" + endereco.getEstado().getSigla() + ")");

        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleInvalidSortByException(final MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest().body(ex.getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleInvalidSortByException(final HttpMessageNotReadableException ex) {
        if (ex.getCause() instanceof InvalidFormatException ife) {
            return ResponseEntity.badRequest().body("O valor: " + ife.getValue() + " é inválido.");
        }
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
