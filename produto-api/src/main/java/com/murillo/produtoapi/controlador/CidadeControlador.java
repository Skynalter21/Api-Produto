package com.murillo.produtoapi.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murillo.produtoapi.entidade.Cidade;
import com.murillo.produtoapi.repositorio.CidadeRepositorio;

@RestController
@RequestMapping("/api")
public class CidadeControlador {

	@Autowired
	CidadeRepositorio cidadeRepositorio;

	@CrossOrigin
	@GetMapping("/cidades")
	public List<Cidade> listaCidade() {
		return cidadeRepositorio.findAll();
	}

}
