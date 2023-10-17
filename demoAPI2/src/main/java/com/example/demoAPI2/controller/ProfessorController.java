package com.example.demoAPI2.controller;

import com.example.demoAPI2.model.Professor;
import com.example.demoAPI2.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository profRepo;

    @GetMapping("/todos")
    public List<Professor> buscarTodosProfs()
    {
        return profRepo.findAll();
    }

    @GetMapping("/todos/cod/{cod}")
    public Optional<Professor> buscarPorCodigo(@PathVariable("cod") int cod)
    {
        return profRepo.findById(cod);
    }
}
