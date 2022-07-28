package br.org.generation.helloworldentrega.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloatividade")
public class HelloWorld {

	@GetMapping
	public String helloatividade() {
		return "Hello World!";
	}
}
