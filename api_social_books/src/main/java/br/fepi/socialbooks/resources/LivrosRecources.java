package br.fepi.socialbooks.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosRecources {
	
	@RequestMapping(value = "/livros",method = RequestMethod.GET)
	public String listar() {
		return "o pequeno principe; Os Segredos da mente milionaria.";
	}

}
