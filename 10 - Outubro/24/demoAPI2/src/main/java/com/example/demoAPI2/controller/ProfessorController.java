package com.example.demoAPI2.controller;

import com.example.demoAPI2.model.Disciplina;
import com.example.demoAPI2.model.Professor;
import com.example.demoAPI2.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/todos/nome/{nome}")
    public List<Professor> buscarPorNome(@PathVariable("nome") String nome){
        return profRepo.findByNome(nome);
    }

    @GetMapping("/todos/sal/{sal}")
    public List<Professor> buscarPorSal(@PathVariable("sal") double sal){
        return profRepo.findBySal(sal);
    }

    @PostMapping("/inserir")
    public void inserirProfessor(@RequestBody Professor p)
    {
        profRepo.save(p);
    }

    @DeleteMapping("/remover")
    public void removerProfessor(@RequestBody Professor p)
    {
        profRepo.delete(p);
    }

    @DeleteMapping("/remover/cod/{cod}")
    public void removerProfessorPorID(@PathVariable("cod") int cod)
    {
        profRepo.deleteById(cod);
    }

    @PutMapping ("/atualizar")
    public void atualizarProfessor(@RequestBody Professor p)
    {
        profRepo.save(p);
    }
}
