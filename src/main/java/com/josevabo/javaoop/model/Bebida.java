package com.josevabo.javaoop.model;

import com.josevabo.javaoop.exception.TamanhoInvalidoException;

public class Bebida extends Produto {

	private boolean gelada;
	private float tamanho;
	private String marca;

	public Bebida(boolean gelada, float tamanho, String marca, String nome, float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.gelada = gelada;
		if(tamanho<0) {
			throw new TamanhoInvalidoException("Tamanho da bebida deve ser positivo");
		}
		this.tamanho = tamanho;
		this.marca = marca;
	}

	@Override
	public String imprimirResumo() {
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Esta bebida do tamanho %.3fL ", tamanho));
		descricao.append(isGelada() ? "está gelada, " : " não está gelada, " );
		descricao.append("e é da marca " + marca );
		return descricao.toString();
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebida{" +
				"gelada=" + gelada +
				", tamanho=" + tamanho +
				", marca='" + marca + '\'' +
				super.toString();
	}
}
