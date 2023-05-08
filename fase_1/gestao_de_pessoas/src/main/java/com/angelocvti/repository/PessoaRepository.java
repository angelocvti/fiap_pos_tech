package com.angelocvti.repository;

import com.angelocvti.domain.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class PessoaRepository {
    private final Set<Pessoa> pessoas;

    public PessoaRepository() {
        pessoas = new HashSet<>();
    }

    public void salvar(final Pessoa pessoa) {
        pessoas.add(pessoa);
    }
}