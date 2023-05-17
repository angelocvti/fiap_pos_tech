package com.angelocvti.controller;

import com.angelocvti.domain.Eletrodomestico;
import com.angelocvti.dto.EletrodomesticoRequest;
import com.angelocvti.repository.EletrodomesticoRepository;
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
@RequestMapping("/eletrodomesticos")
public class EletrodomesticoController {
    @Autowired
    private EletrodomesticoRepository repository;

    @PostMapping
    public ResponseEntity<Eletrodomestico> criarEletrodomestico(@RequestBody @Valid final EletrodomesticoRequest eletrodomesticoRequest) {
        Eletrodomestico eletrodomestico = new Eletrodomestico();

        BeanUtils.copyProperties(eletrodomesticoRequest, eletrodomestico);

        repository.salvar(eletrodomestico);

        return ResponseEntity.status(HttpStatus.CREATED).body(eletrodomestico);
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
