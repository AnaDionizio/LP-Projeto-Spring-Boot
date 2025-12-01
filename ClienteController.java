package com.example.petcare.controller;

import com.example.petcare.model.pessoas.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clientes;
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        boolean removed = clientes.removeIf(c -> c.getId().equals(id));
        return removed ? "Cliente deletado com sucesso!" : "Cliente não encontrado!";
    }
}
