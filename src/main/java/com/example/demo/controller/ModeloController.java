package com.example.demo.controller;

import com.example.demo.dto.ModeloDto;
import com.example.demo.entity.Modelo;
import com.example.demo.mapper.ModeloMapper;
import com.example.demo.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelo")
public class ModeloController {


    @Autowired
    private ModeloService modeloService;

    @GetMapping
    public ResponseEntity<List<ModeloDto>> findAll() {

        List<Modelo> modeloList = modeloService.findAll();
        List<ModeloDto> modeloDtoList = ModeloMapper.converteListaModeloDTOEmListaModelo(modeloList);
        return ResponseEntity.ok().body(modeloDtoList);

    }

    @PostMapping
    public ResponseEntity<ModeloDto> save(@RequestBody ModeloDto modeloDto) {

        Modelo modelo = ModeloMapper.converteModeloDTOEmModelo(modeloDto);
        Modelo savedModelo = modeloService.save(modelo);
        ModeloDto savedModeloDto = ModeloMapper.converteModeloEmModeloDTO(savedModelo);
        return ResponseEntity.ok().body(savedModeloDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModeloDto> update(@PathVariable Long id, @RequestBody ModeloDto modeloDto) {

        Modelo modelo = ModeloMapper.converteModeloDTOEmModelo(modeloDto);
        Modelo updatedModelo = modeloService.update(id, modelo);
        ModeloDto updatedModeloDto = ModeloMapper.converteModeloEmModeloDTO(updatedModelo);
        return ResponseEntity.ok().body(updatedModeloDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ModeloDto> deleteById(@PathVariable Long id) {
        modeloService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
