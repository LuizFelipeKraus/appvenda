package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;
import br.edu.infnet.appvenda.model.repository.EletrodomesticoRepository;

@Service
public class ServicoEletrodomestico {
	@Autowired
	private EletrodomesticoRepository repositoryEletrodomestico;
	
	public void incluir(Eletrodomestico eletronico) {
		repositoryEletrodomestico.save(eletronico);
	}
	
	public Collection<Eletrodomestico> obterLista(){
		return (Collection<Eletrodomestico>) repositoryEletrodomestico.findAll();
	}
	
}
