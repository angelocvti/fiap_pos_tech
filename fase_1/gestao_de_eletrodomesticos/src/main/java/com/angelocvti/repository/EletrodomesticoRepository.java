package com.angelocvti.repository;

import com.angelocvti.domain.Eletrodomestico;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class EletrodomesticoRepository {
    private final Set<Eletrodomestico> eletrodomesticos;

    public EletrodomesticoRepository(Set<Eletrodomestico> eletrodomesticos) {
        this.eletrodomesticos = eletrodomesticos;
    }

    public void salvar(Eletrodomestico eletrodomestico) {
        eletrodomesticos.add(eletrodomestico);
    }
}
