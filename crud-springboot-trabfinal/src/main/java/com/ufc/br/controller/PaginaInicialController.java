package com.ufc.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaginaInicialController {
	
	@RequestMapping(value="/inicio", method=RequestMethod.GET)
	public String paginaInicial() {
		return "index";
	}
}
