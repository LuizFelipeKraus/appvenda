package br.edu.infnet.appvenda.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Moveis;

@Repository
public interface MoveisRepository extends CrudRepository<Moveis, Integer>{
	Moveis findByCor(String cor);
	
	List<Moveis> findAll(Sort sort);
}
