package com.example.demo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;

    @Column(name = "nome_modelo")
    private String nome;

    @Column(name = "valor_fipe")
    private BigDecimal valorFipe;

    public Modelo() {
    }

    public Modelo(Long id, Marca marca, String nome, BigDecimal valorFipe) {
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
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
