package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Moveis;
import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.repository.MoveisRepository;

@Service
public class ServicoMoveis {
	@Autowired
	private MoveisRepository repositoryMoveis;
	
	public void incluir(Moveis moveis) {
		repositoryMoveis.save(moveis);
	}
	
	public Collection<Moveis> obterLista(){
		return (Collection<Moveis>) repositoryMoveis.findAll(Sort.by(Sort.Direction.ASC, "cor"));
	}
	
	public long obterQtde() {
		return repositoryMoveis.count();
	}
	
	public void excluir(Integer id) {
		repositoryMoveis.deleteById(id);
	}
	
	public Moveis pesquisar(String cor) {
		return repositoryMoveis.findByCor(cor);
	}

}
