package br.com.squadra.segurancadigital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segurancadigital/exemplo")
public class ExemploController {

	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		return "Ola " + nome;
	}
}
