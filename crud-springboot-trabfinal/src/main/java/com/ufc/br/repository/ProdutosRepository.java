package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.br.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
