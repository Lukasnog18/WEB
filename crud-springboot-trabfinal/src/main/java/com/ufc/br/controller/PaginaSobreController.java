package com.ufc.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PaginaSobreController {
	
	@RequestMapping(value="/sobre", method=RequestMethod.GET)
	public String paginaSobre() {
		return "sobre";
	}
}