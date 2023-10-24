package com.example.demo.controller;

import com.example.demo.entity.Carro;
import com.example.demo.service.CarroService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService CarroService;

    @GetMapping
    public ResponseEntity<List<Carro>> findAll() {
        return ResponseEntity.ok().body(CarroService.findAll());
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Carro> save(@RequestBody Carro Carro) {
        return ResponseEntity.ok().body(CarroService.save(Carro));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Carro carro) {
        return ResponseEntity.ok().body(CarroService.update(id, carro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        CarroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/withModelo")
    public ResponseEntity<List<Object[]>> findCarroWithModelo(){
        return ResponseEntity.ok().body(CarroService.findCarroWithModelo());
    }
}



