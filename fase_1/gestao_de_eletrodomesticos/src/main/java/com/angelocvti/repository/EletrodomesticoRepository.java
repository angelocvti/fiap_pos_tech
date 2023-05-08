package com.angelocvti.repository;

import com.angelocvti.domain.Eletrodomestico;

import java.util.Set;

public class EletrodomesticoRepository {
    private final Set<Eletrodomestico> eletrodomesticos;

    public EletrodomesticoRepository(Set<Eletrodomestico> eletrodomesticos) {
        this.eletrodomesticos = eletrodomesticos;
    }

    public void salvar(Eletrodomestico eletrodomestico) {
        eletrodomesticos.add(eletrodomestico);
    }
}
