package br.com.alura.springdata.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.springdata.controller.dto.FuncionarioVo;
import br.com.alura.springdata.entity.Funcionario;
import br.com.alura.springdata.projecao.FuncionarioProjecao;
import br.com.alura.springdata.service.CrudFuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	private CrudFuncionarioService service;

	public FuncionarioController(CrudFuncionarioService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) throws URISyntaxException {
		URI uri = new URI("");
		return ResponseEntity.created(uri).body(this.service.save(funcionario));
	}

	@GetMapping
	public ResponseEntity<Page<FuncionarioVo>> findAll() {
		Pageable pageable = Pageable.ofSize(5);
		
		Page<FuncionarioVo> listarTodos = this.service.listarTodos(pageable);
		return ResponseEntity.ok(listarTodos);

	}

	@GetMapping("/projecao")
	public ResponseEntity<Page<FuncionarioProjecao>> findAllByProjection() {
		Pageable pageable = Pageable.ofSize(5);
		
		Page<FuncionarioProjecao> listarTodos = this.service.listarTodosComProjecao(pageable);
		return ResponseEntity.ok(listarTodos);
		
	}

	@GetMapping("/join-fetch")
	public ResponseEntity<List<FuncionarioProjecao>> listarComJoinFetch() {

		return ResponseEntity.ok(this.service.listarTodosComJoinFetch());
		
	}
	
	
}
