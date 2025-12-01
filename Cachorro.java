package com.example.petcare.model.animais;

public class Cachorro extends Animal {

    public Cachorro(Long id, String nome, int idade, String sexo) {
        super(id, nome, idade, "Cachorro", sexo);
    }

    @Override
    public String emitirSom() {
        return "Au Au!";
    }
}


