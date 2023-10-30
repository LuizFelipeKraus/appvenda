package br.edu.infnet.appvenda.model.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.model.repository.ProdutoRepository;

public class ServicoProduto {
	@Autowired
	private ProdutoRepository repositoryProduto;
	
	public void incluir(Produto produto) {
		repositoryProduto.save(produto);
	}
	
	public Collection<Produto> obterLista(){
		return (Collection<Produto>) repositoryProduto.findAll();
	}
}
