package com.murillo.produtoapi.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murillo.produtoapi.entidade.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
	
	Optional<Produto> findById(Long id);
	List<Produto> findByNomeContaining(String nome);
}
