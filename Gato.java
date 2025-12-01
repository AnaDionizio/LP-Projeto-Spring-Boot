package com.example.petcare.model.animais;

public class Gato extends Animal {

    public Gato(Long id, String nome, int idade, String sexo) {
        super(id, nome, idade, "Gato", sexo);
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }
}


