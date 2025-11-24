package com.example.bemestaranimal.dto;

import com.example.bemestaranimal.enums.TipoPessoa;

public class PessoaDTO {

    private Long id;
    private String nome;
    private String email;
    private TipoPessoa tipoPessoa;

    public PessoaDTO() {}

    public PessoaDTO(Long id, String nome, String email, TipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
