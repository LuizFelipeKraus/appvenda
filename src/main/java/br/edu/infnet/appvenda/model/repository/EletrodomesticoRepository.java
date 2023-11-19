package br.edu.infnet.appvenda.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;

@Repository
public interface EletrodomesticoRepository extends CrudRepository<Eletrodomestico, Integer>{
	Eletrodomestico findByMarcar(String marcar);
	
	List<Eletrodomestico> findAll(Sort sort);
}
