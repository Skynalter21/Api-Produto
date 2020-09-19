package com.murillo.produtoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.murillo.produtoapi.controlador.ProdutoControlador;

@ComponentScan(basePackageClasses = { ProdutoControlador.class })
@SpringBootApplication
public class ProdutoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

}
