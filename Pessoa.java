package com.example.petcare.model.pessoas;

public abstract class Pessoa {
    protected Long id;
    protected String nome;
    protected String telefone;

    public Pessoa(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
}
