package br.org.generation.helloworldentrega.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bsm")
public class ListaBsm {
	
	
	@GetMapping
	public String bsm() {
		return "Orientação ao Futuro <br> Responsabilidade Pessoal <br> Mentalidade de Crescimento <br> Persistência <br> Trabalho em Equipe <br> Atençao aos detalhes <br> Proatividade <br> Comunicação";
	}
}
