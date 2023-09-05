package com.josevabo.javaoop.model;

import com.josevabo.javaoop.exception.ValorInvalidoException;

public abstract class Produto {
	private String nome;
	private float valor;
	private Integer codigo;
	
	public Produto() {
	}

	public Produto(String nome, float valor, Integer codigo) {
		this.nome = nome;
		if (valor<0) {
			throw new ValorInvalidoException("Valor deve ser positivo");
		}
		this.valor = valor;
		this.codigo = codigo;
	}

	public abstract String imprimirResumo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return  ", nome='" + nome + '\'' +
				", valor=" + valor +
				", codigo=" + codigo +
				'}';
	}
}
