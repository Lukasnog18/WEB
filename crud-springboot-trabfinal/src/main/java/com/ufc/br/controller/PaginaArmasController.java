package com.ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.br.model.Pessoa;
import com.ufc.br.model.Produto;
import com.ufc.br.service.ProdutosService;

@Controller
@RequestMapping("/produtos")
public class PaginaArmasController {
	
	@Autowired
	private ProdutosService produtoService;
	
	@RequestMapping("/armas")
	public ModelAndView produto() {
		List<Produto> produtos = produtoService.listarProdutos();
		ModelAndView mv = new ModelAndView("armas");
		mv.addObject("todosOsProdutos", produtos);
		return mv;
	}
	
	@PostMapping("/salvarProduto")
	public ModelAndView salvarProduto(Produto produto, @RequestParam(value="imagem") MultipartFile imagem) {
		produtoService.addProduto(produto, imagem);
		
		ModelAndView mv = new ModelAndView("redirect:/produtos/listar");
		
		return mv;
	}
	
	@GetMapping("/listar")
	public ModelAndView listarProdutos() {
	  List<Produto> produtos = produtoService.listarProdutos();
	  ModelAndView mv = new ModelAndView("listar-produtos");
	  mv.addObject("todosOsProdutos", produtos);
	  
	  return mv;
	}
	
	@RequestMapping("/addProduto")
	public ModelAndView addProduto() {
		ModelAndView mv = new ModelAndView("adicionar-produtos");
		mv.addObject("produto", new Produto());
		return mv;
	}
	
	@RequestMapping("/excluir/{id}")
	public ModelAndView excluirProduto(@PathVariable Long id) {
		produtoService.excluirPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/produtos/listar");
		return mv;
	}
	
}