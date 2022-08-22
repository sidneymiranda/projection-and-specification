package br.com.alura.springdata.controller.dto;

public class FuncionarioVo {

	private String nome;
	private Double salario;

	public FuncionarioVo() {
	}

	public FuncionarioVo(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

}
