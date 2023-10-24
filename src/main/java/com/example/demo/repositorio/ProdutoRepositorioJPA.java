package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Produto;

public interface ProdutoRepositorioJPA extends JpaRepository<Produto, Integer> {

}
