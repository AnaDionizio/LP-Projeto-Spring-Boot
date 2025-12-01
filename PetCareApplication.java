package com.example.petcare;

import com.example.petcare.model.animais.Cachorro;
import com.example.petcare.model.animais.Gato;
import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.model.produtos.Produto;
import com.example.petcare.model.transacoes.Adocao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetCareApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetCareApplication.class, args);

        System.out.println("\n========= SIMULAÇÃO PETCARE =========\n");

        // Criação de cliente
        Cliente cliente = new Cliente(1L, "João da Silva", "9999-9999", "Rua A");

        // Criação de animais com o novo parâmetro "sexo"
        Cachorro rex = new Cachorro(1L, "Rex", 3, "Macho");
        Gato mimi = new Gato(2L, "Mimi", 2, "Fêmea");

        // Produto
        Produto racao = new Produto(1L, "Ração Premium 20kg", 20, 49.99);

        // Simulação de adoção
        System.out.println("🐶 Adoção realizada...");
        Adocao adocao = new Adocao(1L, cliente, rex);
        System.out.println(adocao.gerarCertificado());

        // Simulação de baixa de estoque
        System.out.println("\n📦 Baixa de estoque...");
        racao.baixarEstoque(3);
        System.out.println("Estoque atual: " + racao.getQuantidade());
    }
}
