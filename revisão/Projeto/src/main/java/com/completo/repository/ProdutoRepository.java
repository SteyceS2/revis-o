package com.completo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.completo.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	//Query
	List<Produto>findByNome(String nome);
	List<Produto> findByDescricao(String Descricao);
}
