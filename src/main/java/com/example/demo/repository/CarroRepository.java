package com.example.demo.repository;

import com.example.demo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

//    @Query("SELECT c.id, c.timeStampCadastro, m.id, c.ano, c.combustivel, c.numeroPortas, c.cor, m.nome, m.valorFipe FROM Carro c INNER JOIN c.modelo m")
//    List<Carro> findCarrosWithModeloDetails();

}
