package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.ufc.br.model.Produto;
import com.ufc.br.repository.ProdutosRepository;
import com.ufc.br.util.TrabFileUtils;

@Service
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public void addProduto(Produto produto, MultipartFile imagem){
		String caminho = "img/" + produto.getNome() + ".jpg";
		TrabFileUtils.salvarImagem(caminho, imagem);
		
		produtosRepository.save(produto);
	}
	
	public void excluirPorId(Long id) {
		produtosRepository.deleteById(id);
		
	}
	
	public List<Produto> listarProdutos() {
		return produtosRepository.findAll();
	}
}
