package br.org.generation.helloworldentrega.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aprendizagem")
public class Aprendizado {
	@GetMapping
	public String objetivos(){
        String arrayAsString = Arrays.toString(returnArrayString());
        return arrayAsString;

    }

    private String[] returnArrayString() {
        return new String[] {"<li> Estudar Mais <br> <li>Aprender STS <br><li> MySQL"};
}
}
