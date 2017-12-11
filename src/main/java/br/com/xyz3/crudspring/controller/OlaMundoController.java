package br.com.xyz3.crudspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String execute() {
		
		System.out.println("Executando a lógica com Spring MVC");
		return "ok";
		
	}
	
	@RequestMapping("/xyz")
	public String agoravai() {
		
		System.out.println("Executando a segunda...");
		return "ok";
		
	}

}
