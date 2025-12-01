package com.example.petcare.service;

import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.model.produtos.Produto;
import com.example.petcare.model.transacoes.Doacao;
import org.springframework.stereotype.Service;

@Service
public class DoacaoService {

    public Doacao realizarDoacao(Long id, Cliente cliente, Produto produto, int qtd) {
        return new Doacao(id, cliente, produto, qtd);
    }
}
