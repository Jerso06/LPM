package com.example.cliProdAPI.controller;

import com.example.cliProdAPI.model.Cliente;
import com.example.cliProdAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository clrepo;

    @PostMapping ("/inserir")
    public void cadastrarCliente(@RequestBody Cliente cli)
    {
        clrepo.save(cli);
    }
}
