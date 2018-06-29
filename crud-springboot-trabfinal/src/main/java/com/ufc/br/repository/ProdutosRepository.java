package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.br.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

}
