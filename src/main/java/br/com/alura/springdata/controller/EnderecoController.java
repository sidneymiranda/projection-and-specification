package br.com.alura.springdata.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.springdata.entity.Enderecos;
import br.com.alura.springdata.entity.Funcionario;
import br.com.alura.springdata.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	private EnderecoService service;

	public EnderecoController(EnderecoService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Enderecos> save(@RequestBody Enderecos endereco) throws URISyntaxException {
		URI uri = new URI("");
		return ResponseEntity.created(uri).body(this.service.save(endereco));
	}

}
