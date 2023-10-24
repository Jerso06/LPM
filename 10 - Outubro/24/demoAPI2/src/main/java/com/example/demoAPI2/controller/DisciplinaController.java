package com.example.demoAPI2.controller;

import com.example.demoAPI2.model.Disciplina;

import com.example.demoAPI2.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiDisciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaRepository discrepo;

    @GetMapping ("/todos")
    public List<Disciplina> buscarTodasDisciplinas()
    {
        return discrepo.findAll();
    }

    @GetMapping ("/todos/cod/{cod}")
    public Optional<Disciplina> buscarPorCod(@PathVariable("cod") int cod)
    {
        return discrepo.findById(cod);
    }

    @GetMapping ("/todos/nome/{nome}")
    public List<Disciplina> buscarPorNome(@PathVariable("nome") String nome)
    {
        return discrepo.findByNome(nome);
    }

    @GetMapping ("/todos/cargaHoraria/{cargaHoraria}")
    public List<Disciplina> buscarPorCargaHoraria(@PathVariable("cargaHoraria") int cargaH)
    {
        return discrepo.findByCargaHoraria(cargaH);
    }

    @GetMapping ("/todos/sigla/{sigla}")
    public List<Disciplina> buscarPorSigla(@PathVariable("sigla") String sigla)
    {
        return discrepo.findBySigla(sigla);
    }

    @PostMapping ("/inserir")
    public void inserirDisciplina(@RequestBody Disciplina disc)
    {
        discrepo.save(disc);
    }

    @DeleteMapping("/remover")
    public void removerDisciplina(@RequestBody Disciplina disc)
    {
        discrepo.delete(disc);
    }

    @DeleteMapping("/remover/cod/{cod}")
    public void removerDisciplinaPorID(@PathVariable("cod") int cod)
    {
        discrepo.deleteById(cod);
    }

    @PutMapping("/atualizar")
    public void atualizarDisciplina(@RequestBody Disciplina disc)
    {
        discrepo.save(disc);
    }

    @GetMapping("/todos/siglacod/{sigla}/{cod}")
    public List<Disciplina> buscarPorSiglaCod(@PathVariable("sigla") String sigla, @PathVariable("cod") int cod)
    {
        return discrepo.findBySiglaCod(sigla, cod);
    }

    @GetMapping("/todos/nomecod/{nome}/{cod}")
    public List<Disciplina> buscarPorNomeCod(@PathVariable("nome") String nome, @PathVariable("cod") int cod)
    {
        return discrepo.findByNomeCod(nome, cod);
    }

    @GetMapping("/todos/siglanome/{sigla}/{nome}")
    public List<Disciplina> buscarPorSiglaNome(@PathVariable("sigla") String sigla, @PathVariable("nome") String nome)
    {
        return discrepo.findBySiglaNome(sigla, nome);
    }
}
