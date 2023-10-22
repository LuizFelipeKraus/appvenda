package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Moveis;

@Service
public class ServicoMoveis {
private Map<Integer,Moveis> mapaVendedor = new HashMap<Integer,Moveis>();
	
	public void incluir(Moveis moveis) {
		mapaVendedor.put(moveis.getCodigo(), moveis);
	}
	
	public Collection<Moveis> obterLista(){
		return mapaVendedor.values();
	}
}
