package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findByCargaHoraria(int cargaHoraria);

    List<Disciplina> findBySigla(String sigla);
}
