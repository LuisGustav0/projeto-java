package com.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venda.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
