package com.example.demo.controller;

import com.example.demo.entity.Modelo;
import com.example.demo.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modelo")
public class ModeloController {


    @Autowired
    private ModeloService modeloService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(modeloService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Modelo modelo) {
        return ResponseEntity.ok().body(modeloService.save(modelo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Modelo modelo) {
        return ResponseEntity.ok().body(modeloService.update(id, modelo));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        modeloService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
