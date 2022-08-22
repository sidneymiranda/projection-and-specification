package br.com.alura.springdata.controller.dto;

public class EnderecoVo {

	private String cidade;
	private String estado;

	public EnderecoVo() {
	}

	public EnderecoVo(String cidade, String estado) {
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

}
