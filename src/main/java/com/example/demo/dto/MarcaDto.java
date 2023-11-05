package com.example.demo.dto;

import jakarta.persistence.Column;

public class MarcaDto {


    private Long id;

    @Column(name = "nome_marca")
    private String nome;

    public MarcaDto() {
    }

    public MarcaDto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
