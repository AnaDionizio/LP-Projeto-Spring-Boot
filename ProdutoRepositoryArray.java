package com.example.petcare.repository;

import com.example.petcare.model.produtos.Produto;

public class ProdutoRepositoryArray {
    private Produto[] produtos = new Produto[50];
    private int index = 0;

    public void salvar(Produto p) {
        produtos[index++] = p;
    }

    public Produto buscarPorId(Long id) {
        for (Produto p : produtos)
            if (p != null && id == p.getQuantidade()) return p;
        return null;
    }
}
