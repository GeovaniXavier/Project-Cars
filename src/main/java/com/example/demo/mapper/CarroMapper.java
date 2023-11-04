package com.example.demo.mapper;

import com.example.demo.dto.CarroDto;
import com.example.demo.entity.Carro;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Configuration
public class CarroMapper {

    @Bean
    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static Carro converteCarroDtoEmCarro(CarroDto carroDto) {
        return modelMapper().map(carroDto, Carro.class);

    }

    public static CarroDto converteCarroEmCarroDto(Carro carro) {
        return modelMapper().map(carro, CarroDto.class);
    }

    public static List<CarroDto> converteUmaListaDeCarrosEmCarrosDto(List<Carro> carros) {
        return carros.stream()
                .map(CarroMapper::converteCarroEmCarroDto)
                .collect(Collectors.toList());

    }
}
