package com.example.cliProdAPI.repository;

import com.example.cliProdAPI.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Integer> {

}
