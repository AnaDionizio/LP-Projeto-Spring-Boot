package com.example.petcare.model.animais;

public abstract class Animal {
    protected Long id;
    protected String nome;
    protected int idade;
    protected boolean adotado;
    protected String situacao;
    protected String tipo;
    protected String sexo; // ⬅ NOVO

    public Animal(Long id, String nome, int idade, String tipo, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.sexo = sexo;
        this.adotado = false;
        this.situacao = "Disponível";
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
        this.adotado = situacao.equals("Adotado");
    }

    public abstract String emitirSom();

    public void marcarComoAdotado() {
        this.adotado = true;
        this.situacao = "Adotado";
    }

    public boolean isAdotado() {
        return adotado;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) { this.sexo = sexo; }
}
