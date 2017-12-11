package br.com.xyz3.crudspring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {

	private Integer id;
	
	@NotNull @Size(min=7)
	private String nome;
	private String telefone;
	
	public Cliente() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
}
