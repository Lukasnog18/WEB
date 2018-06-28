package com.ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.ufc.br.model.Produtos;
import com.ufc.br.repository.ProdutosRepository;
import com.ufc.br.util.TrabFileUtils;

public class ProdutosService {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public void salvarProduto(Produtos produto, MultipartFile imagem){
		String caminho = "img/" + produto.getNome() + ".png";
		TrabFileUtils.salvarImagem(caminho, imagem);
		
		produtosRepository.save(produto);
	}
	
	public void excluirPorId(Long id) {
		produtosRepository.deleteById(id);
		
	}
}
