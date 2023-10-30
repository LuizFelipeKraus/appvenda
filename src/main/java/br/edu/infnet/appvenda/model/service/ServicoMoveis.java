package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Moveis;
import br.edu.infnet.appvenda.model.repository.MoveisRepository;

@Service
public class ServicoMoveis {
	@Autowired
	private MoveisRepository repositoryMoveis;
	
	public void incluir(Moveis moveis) {
		repositoryMoveis.save(moveis);
	}
	
	public Collection<Moveis> obterLista(){
		return (Collection<Moveis>) repositoryMoveis.findAll();
	}
}
