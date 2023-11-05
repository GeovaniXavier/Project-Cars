package com.example.demo.controller;

import com.example.demo.dto.CarroDto;
import com.example.demo.dto.CustomDto;
import com.example.demo.entity.Carro;
import com.example.demo.mapper.CarroMapper;
import com.example.demo.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public ResponseEntity<List<CarroDto>> findAll() {

        List<Carro> carroList = carroService.findAll();
        List<CarroDto> carroDtoList = CarroMapper.converteListCarroEmListCarroDto(carroList);
        return ResponseEntity.ok().body(carroDtoList);

    }

    @PostMapping
    public ResponseEntity<CarroDto> save(@RequestBody CarroDto dto) {
        Carro carro = CarroMapper.converteCarroDtoEmCarro(dto);
        Carro savedCarro = carroService.save(carro);
        CarroDto savedCarroDto = CarroMapper.converteCarroEmCarroDto(savedCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCarroDto);
    }


    @PutMapping("/{id}")
    public ResponseEntity<CarroDto> update(@PathVariable Long id, @RequestBody CarroDto carroDto) {
        Carro carro = CarroMapper.converteCarroDtoEmCarro(carroDto);
        Carro updatedCarro = carroService.update(id, carro);
        CarroDto updatedCarroDto = CarroMapper.converteCarroEmCarroDto(updatedCarro);
        return ResponseEntity.ok().body(updatedCarroDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CarroDto> deleteById(@PathVariable Long id) {
        carroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/withModelo")
    public ResponseEntity<List<CustomDto>> findCarroWithModelo() {
        return ResponseEntity.ok().body(carroService.findCarroWithModelo());
    }
}



