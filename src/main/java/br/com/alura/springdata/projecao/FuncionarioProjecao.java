package br.com.alura.springdata.projecao;

import java.util.List;

public interface FuncionarioProjecao {

	String getNome();
	Double getSalario();
	List<EnderecoProjecao> getEnderecos();
}
