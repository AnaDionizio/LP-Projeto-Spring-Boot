package com.example.petcare.service;

import com.example.petcare.model.produtos.Produto;
import com.example.petcare.repository.ProdutoRepositoryArray;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private ProdutoRepositoryArray repo = new ProdutoRepositoryArray();

    public void cadastrar(Produto p) { repo.salvar(p); }
    public Produto buscar(Long id) { return repo.buscarPorId(id); }
}
