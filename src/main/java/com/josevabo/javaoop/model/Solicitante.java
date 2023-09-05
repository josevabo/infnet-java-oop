package com.josevabo.javaoop.model;

import com.josevabo.javaoop.exception.EmailInvalidoException;

public class Solicitante {

	private String nome;
	private String cpf;
	private String email;
	
	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		if(!email.contains("@")) {
			throw new EmailInvalidoException("email com formato inválido!");
		}
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
