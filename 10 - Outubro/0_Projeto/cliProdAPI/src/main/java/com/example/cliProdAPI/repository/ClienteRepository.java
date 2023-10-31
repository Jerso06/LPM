package com.example.cliProdAPI.repository;

import com.example.cliProdAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
