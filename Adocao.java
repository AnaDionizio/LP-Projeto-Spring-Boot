package com.example.petcare.model.transacoes;

import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.model.animais.Animal;

public class Adocao {
    private Long id;
    private Cliente cliente;
    private Animal animal;

    public Adocao(Long id, Cliente cliente, Animal animal) {
        this.id = id;
        this.cliente = cliente;
        this.animal = animal;
        this.animal.marcarComoAdotado();
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String gerarCertificado() {
        return "===== CERTIFICADO DE ADOÇÃO =====\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "Animal: " + animal.getClass().getSimpleName() + "\n" +
                "Situação: ADOÇÃO CONCLUÍDA\n";
    }
}
