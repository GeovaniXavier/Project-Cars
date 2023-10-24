package com.example.demo.service;

import com.example.demo.entity.Carro;
import com.example.demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro save(Carro Carro) {
        return carroRepository.save(Carro);
    }

    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public Carro update(Long id, Carro carro) {
        Carro carro1 = carroRepository.findById(id).get();

        carro1.setTimeStampCadastro(carro.getTimeStampCadastro());
        carro1.setModelo(carro.getModelo());
        carro1.setAno(carro.getAno());
        carro1.setCombustivel(carro.getCombustivel());
        carro1.setNumeroPortas(carro.getNumeroPortas());
        carro1.setCor(carro.getCor());
        return carroRepository.save(carro1);
    }

    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }

    public List<Object[]> findCarroWithModelo() {
        return carroRepository.findCarrosWithModeloDetails();
    }

}
