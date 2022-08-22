package br.com.alura.springdata.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alura.springdata.controller.dto.FuncionarioVo;
import br.com.alura.springdata.entity.Funcionario;
import br.com.alura.springdata.projecao.FuncionarioProjecao;
import br.com.alura.springdata.repository.FuncionarioRepository;

@Service
public class CrudFuncionarioService {

	private FuncionarioRepository repository;

	public CrudFuncionarioService(FuncionarioRepository repository) {
		this.repository = repository;
	}

	@Transactional
	public Page<FuncionarioVo> listarTodos(Pageable pageable) {

		return repository.listarFuncionarios(pageable);
	}

	@Transactional
	public Funcionario save(Funcionario funcionario) {
		return this.repository.save(funcionario);
	}

	public Page<FuncionarioProjecao> listarTodosComProjecao(Pageable pageable) {
		return this.repository.listarComProjecao(pageable);
	}

	public List<FuncionarioProjecao> listarTodosComJoinFetch() {
		return this.repository.listarFuncionarioJoinFetch();
	}
}
