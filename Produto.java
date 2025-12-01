package com.example.petcare.model.produtos;

public class Produto {
    private Long id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(Long id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void baixarEstoque(int qtd) {
        if (qtd > quantidade) throw new RuntimeException("Estoque insuficiente!");
        quantidade -= qtd;
    }

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}
