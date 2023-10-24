package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findByCargaHoraria(int cargaHoraria);

    List<Disciplina> findBySigla(String sigla);

    @Query("select d from Disciplina d where d.sigla like %?1% and d.cod > ?2")
    List<Disciplina> findBySiglaCod(String sigla, int cod);

    @Query("select d from Disciplina d where d.nome like %?1% and d.cod < ?2")
    List<Disciplina> findByNomeCod(String nome, int cod);

    @Query("select d from Disciplina d where d.sigla like %?1% and d.nome like %?2%")
    List<Disciplina> findBySiglaNome(String sigla, String nome);
}
