package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findBySal(double sal);
}
