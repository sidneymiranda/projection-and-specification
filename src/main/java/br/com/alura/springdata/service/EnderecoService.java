package br.com.alura.springdata.service;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.entity.Enderecos;
import br.com.alura.springdata.repository.EnderecoRepository;


@Service
public class EnderecoService {

	private EnderecoRepository respository;

	public EnderecoService(EnderecoRepository respository) {
		this.respository = respository;
	}

	public Enderecos save(Enderecos endereco) {
		return this.respository.save(endereco);
	}

}
