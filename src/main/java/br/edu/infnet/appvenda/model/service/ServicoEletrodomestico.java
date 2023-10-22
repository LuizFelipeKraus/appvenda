package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;

@Service
public class ServicoEletrodomestico {
private Map<Integer,Eletrodomestico> mapaEletronico = new HashMap<Integer,Eletrodomestico>();
	
	public void incluir(Eletrodomestico eletronico) {
		mapaEletronico.put(eletronico.getCodigo(), eletronico);
	}
	
	public Collection<Eletrodomestico> obterLista(){
		return mapaEletronico.values();
	}
	
}
