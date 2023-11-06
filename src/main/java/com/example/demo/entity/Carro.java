package com.example.demo.entity;

import com.example.demo.dto.CustomDto;
import com.example.demo.dto.CustomDtoList;
import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "timestamp_cadastro")
    private Integer timeStampCadastro;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    private Integer ano;

    private String combustivel;

    @Column(name = "num_portas")
    private Integer numeroPortas;

    private String cor;

    public Carro() {
    }

    public Carro(Long id, Integer timeStampCadastro, Modelo modelo, Integer ano, String combustivel, Integer numeroPortas, String cor) {
        this.id = id;
        this.timeStampCadastro = timeStampCadastro;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.numeroPortas = numeroPortas;
        this.cor = cor;
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

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
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

    public CustomDtoList toCustomDtoList() {
        return new CustomDtoList(new CustomDto(this.id, this.timeStampCadastro, this.modelo.getId(), this.ano, this.combustivel, this.numeroPortas, this.cor, this.modelo.getNome(), this.modelo.getValorFipe()));
    }
}
