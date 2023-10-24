package com.example.demoAPI2.controller;

import com.example.demoAPI2.model.Aluno;
import com.example.demoAPI2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alrepo;

    @GetMapping ("/todos")
    public List<Aluno> buscarTodosAlunos()
    {
        return alrepo.findAll();
    }

    @GetMapping("/todos/ra/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable("ra") int ra)
    {
        return alrepo.findById(ra);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Aluno> buscarPorNome(@PathVariable("nome") String nome){
        return alrepo.findByNome(nome);
    }

    @GetMapping("/todos/altura/{altura}")
    public List<Aluno> buscarPorAltura(@PathVariable("altura") double altura){
        return alrepo.findByAltura(altura);
    }

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Aluno al){
        alrepo.save(al);
    }

    @DeleteMapping("/remover")
    public void removerAluno(@RequestBody Aluno al)
    {
        alrepo.delete(al);
    }

    @DeleteMapping("/remover/ra/{ra}")
    public void removerAlunoPorID(@PathVariable("ra") int ra)
    {
        alrepo.deleteById(ra);
    }

    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al)
    {
        alrepo.save(al);
    }
}
