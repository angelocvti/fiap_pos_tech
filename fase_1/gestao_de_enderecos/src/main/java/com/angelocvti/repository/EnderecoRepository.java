package com.angelocvti.repository;

import com.angelocvti.domain.Endereco;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class EnderecoRepository {
    private final Set<Endereco> enderecos;

    public EnderecoRepository() {
        enderecos = new HashSet<>();
    }

    public void salvar(Endereco endereco) {
        enderecos.add(endereco);
    }
}
