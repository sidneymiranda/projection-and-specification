package br.com.alura.springdata.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enderecos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cidade;
	private String estado;

	@ManyToOne(fetch = FetchType.LAZY)
	private Funcionario funcionario;

	public Enderecos() {
	}

	public Enderecos(String cidade, String estado, Funcionario funcionario) {
		this.cidade = cidade;
		this.estado = estado;
		this.funcionario = funcionario;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Enderecos [id=" + id + ", cidade=" + cidade + ", estado=" + estado + ", funcionario=" + funcionario
				+ "]";
	}

}
