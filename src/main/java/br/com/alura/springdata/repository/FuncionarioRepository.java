package br.com.alura.springdata.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.controller.dto.FuncionarioVo;
import br.com.alura.springdata.entity.Funcionario;
import br.com.alura.springdata.projecao.FuncionarioProjecao;

@Repository
public interface FuncionarioRepository
		extends PagingAndSortingRepository<Funcionario, Long>, JpaSpecificationExecutor<Funcionario> {

	@Query("SELECT new br.com.alura.springdata.controller.dto.FuncionarioVo(f.nome, f.salario) FROM Funcionario f")
	Page<FuncionarioVo> listarFuncionarios(Pageable pageable);

	
	@Query(value = "SELECT f.nome, f.salario FROM Funcionario f", nativeQuery = true)
	Page<FuncionarioProjecao> listarComProjecao(Pageable pageable);
	
	@Query("SELECT f FROM Funcionario f JOIN FETCH f.enderecos")
	List<FuncionarioProjecao> listarFuncionarioJoinFetch();

}
