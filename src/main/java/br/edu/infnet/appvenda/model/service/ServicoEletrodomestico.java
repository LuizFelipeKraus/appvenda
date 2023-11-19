package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;
import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.repository.EletrodomesticoRepository;

@Service
public class ServicoEletrodomestico {
	@Autowired
	private EletrodomesticoRepository repositoryEletrodomestico;
	

	public void incluir(Eletrodomestico Eletrodomestico) {
		repositoryEletrodomestico.save(Eletrodomestico);
	}
	
	public Collection<Eletrodomestico> obterLista(){	
		return (Collection<Eletrodomestico>) repositoryEletrodomestico.findAll(Sort.by(Sort.Direction.ASC, "marcar"));
	}

	public long obterQtde() {
		return repositoryEletrodomestico.count();
	}
	
	public void excluir(Integer id) {
		repositoryEletrodomestico.deleteById(id);
	}
	
	public Eletrodomestico pesquisar(String marcar) {
		return repositoryEletrodomestico.findByMarcar(marcar);
	}

}
