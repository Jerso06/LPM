package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

    List<Aluno> findByNome(String nome);

    List<Aluno> findByAltura(double altura);

    @Query("select a from Aluno a where.nome like %?1%")
    List<Aluno> findByParteNome(String parteNome);
}
