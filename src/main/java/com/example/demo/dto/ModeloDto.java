package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ModeloDto {

    private Long id;

    private Long marca;

    @JsonProperty("nome_modelo")
    private String nome;

    @JsonProperty("valor_fipe")
    private BigDecimal valorFipe;

    public ModeloDto() {
    }

    public ModeloDto(Long id, Long marca, String nome, BigDecimal valorFipe) {
        this.id = id;
        this.marca = marca;
        this.nome = nome;
        this.valorFipe = valorFipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarca() {
        return marca;
    }

    public void setMarca(Long marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(BigDecimal valorFipe) {
        this.valorFipe = valorFipe;
    }
}
