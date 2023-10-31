package com.example.cliProdAPI.controller;

import com.example.cliProdAPI.model.Produto;
import com.example.cliProdAPI.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository prodrepo;

    @PostMapping ("/inserir")
    public void cadastrarProduto(@RequestBody Produto prd)
    {
        prodrepo.save(prd);
    }
}
