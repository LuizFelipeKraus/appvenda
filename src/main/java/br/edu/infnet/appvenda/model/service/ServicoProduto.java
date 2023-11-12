package br.edu.infnet.appvenda.model.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.model.domain.Vendedor;
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
	
	public Collection<Produto> obterLista(Vendedor vendedor){	
		return (Collection<Produto>) repositoryProduto.obterLista(vendedor.getId());
	}

	public Collection<Produto> obterLista(Integer id){	
		return (Collection<Produto>) repositoryProduto.obterLista(id);
	}

	public long obterQtde() {
		return repositoryProduto.count();
	}
	
	
	public void excluir(Integer id) {
		repositoryProduto.deleteById(id);
	}

	

}
