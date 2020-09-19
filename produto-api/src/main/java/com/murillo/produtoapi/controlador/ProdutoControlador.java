package com.murillo.produtoapi.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murillo.produtoapi.entidade.Produto;
import com.murillo.produtoapi.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControlador {

	@Autowired
	ProdutoRepositorio produtoRepositorio;

	@CrossOrigin
	@GetMapping("/produtos")
	public List<Produto> listaProdutos() {
		return produtoRepositorio.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/produto/procura/{nome}")
	public List<Produto> listaProdutoNome(@PathVariable(value = "nome") String nome) {
		return produtoRepositorio.findByNomeContaining(nome);
	}
	
	@CrossOrigin
	@GetMapping("/produto/{id}")
	public Produto listaProdutoId(@PathVariable(value = "id") long id) {
		return produtoRepositorio.findById(id).orElse(null);
	}
	
	@CrossOrigin
	@PostMapping("/produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepositorio.save(produto);
	}
	
	@CrossOrigin
	@DeleteMapping("/produto/{id}")
	public void deletaProduto(@PathVariable Long id) {
		produtoRepositorio.deleteById(id);
	}
	
	@CrossOrigin
	@PutMapping("/produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepositorio.save(produto);

	}

	@CrossOrigin
	@GetMapping
	public String sayHello() {
		return "Hello World";
	}

	@CrossOrigin
	@GetMapping("/teste")
	public String teset() {
		return "É apenas depois de perder tudo que perder tudo que \n somos livres para fazer qualquer coisa.";
	}
}
