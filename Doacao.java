package com.example.petcare.model.transacoes;

import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.model.produtos.Produto;

public class Doacao {
    private Long id;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Doacao(Long id, Cliente cliente, Produto produto, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
