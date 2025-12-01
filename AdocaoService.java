package com.example.petcare.service;

import com.example.petcare.model.animais.Animal;
import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.model.transacoes.Adocao;
import org.springframework.stereotype.Service;

@Service
public class AdocaoService {

    public Adocao realizarAdocao(Long id, Cliente cliente, Animal animal) {
        if (animal.isAdotado()) {
            throw new RuntimeException("Animal já adotado!");
        }
        return new Adocao(id, cliente, animal);
    }
}


