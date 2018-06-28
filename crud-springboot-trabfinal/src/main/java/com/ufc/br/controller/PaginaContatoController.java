package com.ufc.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaginaContatoController {
	
	@RequestMapping(value="/contato", method=RequestMethod.GET)
	public String paginaSobre() {
		return "contato";
	}
}
