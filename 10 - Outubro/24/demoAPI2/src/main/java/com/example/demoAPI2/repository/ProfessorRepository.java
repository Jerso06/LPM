package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findBySal(double sal);

    @Query("select p from Professor p where p.nome like %?1% and p.sal > ?2")
    List<Professor> findByNomeSal(String nome, double sal);

    @Query("select p from Professor p where p.nome like %?1% and p.cod < ?2")
    List<Professor> findByNomeCod(String nome, int cod);
}
