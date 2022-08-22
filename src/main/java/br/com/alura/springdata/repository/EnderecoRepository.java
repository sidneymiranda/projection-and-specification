package br.com.alura.springdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.entity.Enderecos;

@Repository
public interface EnderecoRepository extends PagingAndSortingRepository<Enderecos, Long> {

	
}
