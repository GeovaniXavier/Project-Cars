package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CustomDto {


    private Long id;

    private Integer timeStampCadastro;

    @JsonProperty("modelo_id")
    private Long modeloId;

    private Integer ano;

    private String combustivel;

    private Integer numeroPortas;

    private String cor;

    @JsonProperty("nome_modelo")
    private String nomeModelo;

    @JsonProperty("valor")
    private BigDecimal valorFipe;


    public CustomDto(Long id, Integer timeStampCadastro, Long modeloId, Integer ano, String combustivel, Integer numeroPortas, String cor, String nomeModelo, BigDecimal valorFipe) {
        this.id = id;
        this.timeStampCadastro = timeStampCadastro;
        this.modeloId = modeloId;
        this.ano = ano;
        this.combustivel = combustivel;
        this.numeroPortas = numeroPortas;
        this.cor = cor;
        this.nomeModelo = nomeModelo;
        this.valorFipe = valorFipe;
    }

    public CustomDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTimeStampCadastro() {
        return timeStampCadastro;
    }

    public void setTimeStampCadastro(Integer timeStampCadastro) {
        this.timeStampCadastro = timeStampCadastro;
    }

    public Long getModeloId() {
        return modeloId;
    }

    public void setModeloId(Long modeloId) {
        this.modeloId = modeloId;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public BigDecimal getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(BigDecimal valorFipe) {
        this.valorFipe = valorFipe;
    }
}
