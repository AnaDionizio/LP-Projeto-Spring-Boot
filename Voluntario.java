package com.example.petcare.model.pessoas;

public class Voluntario extends Pessoa {
    private int horasSemanais;

    public Voluntario(Long id, String nome, String telefone, int horasSemanais) {
        super(id, nome, telefone);
        this.horasSemanais = horasSemanais;
    }
}
