package com.example.demo.dto;

import com.example.demo.entity.Carro;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CustomResultDtoList {

    @JsonProperty("cars")
    private List<Carro> carroList;

    public CustomResultDtoList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    public CustomResultDtoList() {
    }

    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }
}
