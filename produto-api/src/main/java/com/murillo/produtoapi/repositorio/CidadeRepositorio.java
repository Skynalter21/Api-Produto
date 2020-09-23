package com.murillo.produtoapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murillo.produtoapi.entidade.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {

}
