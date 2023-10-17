package com.example.demoAPI2.repository;

import com.example.demoAPI2.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {

}
