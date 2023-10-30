package br.edu.infnet.appvenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.repository.VendedorRepository;

@Service
public class ServicoVendedor {
	
	@Autowired
	private VendedorRepository repositoryVendedor;
	
	
	public void incluir(Vendedor vendedor) {
		repositoryVendedor.save(vendedor);
	}
	
	public Collection<Vendedor> obterLista(){
		return (Collection<Vendedor>) repositoryVendedor.findAll();
	}

}
