package com.example.petcare.model.pessoas;

public class Cliente extends Pessoa {
    private String endereco;

    public Cliente(Long id, String nome, String telefone, String endereco) {
        super(id, nome, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
