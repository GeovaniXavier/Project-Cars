package com.example.demo.mapper;

import com.example.demo.dto.CarroDto;
import com.example.demo.entity.Carro;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CarroMapper {

    private static ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static Carro converteCarroDtoEmCarro(CarroDto carroDto) {
        return modelMapper().map(carroDto, Carro.class);
    }

    public static CarroDto converteCarroEmCarroDto(Carro carro) {
        return modelMapper().map(carro, CarroDto.class);
    }

    public static List<CarroDto> converteListCarroEmListCarroDto(List<Carro> carroList) {
        return carroList.stream().map(CarroMapper::converteCarroEmCarroDto).collect(Collectors.toList());
    }
}
