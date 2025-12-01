package com.example.petcare.controller;

import com.example.petcare.model.produtos.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtos;
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id) {
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        boolean removed = produtos.removeIf(p -> p.getId().equals(id));
        return removed ? "Produto deletado com sucesso!" : "Produto não encontrado!";
    }

}
