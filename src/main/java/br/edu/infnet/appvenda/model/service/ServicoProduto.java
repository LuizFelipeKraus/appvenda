package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.appvenda.model.domain.Produto;

public class ServicoProduto {
private Map<Integer,Produto> mapaProduto = new HashMap<Integer,Produto>();
	
	public void incluir(Produto produto) {
		mapaProduto.put(produto.getCodigo(), produto);
	}
	
	public Collection<Produto> obterLista(){
		return mapaProduto.values();
	}
}
