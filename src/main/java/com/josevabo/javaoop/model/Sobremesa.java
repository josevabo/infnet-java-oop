package com.josevabo.javaoop.model;

import com.josevabo.javaoop.exception.QuantidadeInvalidaException;

public class Sobremesa extends Produto{

	private float quantidade;
	private boolean doce;
	private String informacao;

	public Sobremesa(float quantidade, boolean doce, String informacoes, String nome, float valor, Integer codigo) {
		super(nome, valor, codigo);
		if(quantidade<0) {
			throw new QuantidadeInvalidaException("Quantidade da sobremesa deve ser maior que zero");
		}
		this.quantidade = quantidade;
		this.doce = doce;
		this.informacao = informacoes;
	}

	@Override
	public String imprimirResumo() {
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Esta sobremesa é servida na quantidade %.0f gramas" , quantidade));
		descricao.append(isDoce() ? " e é doce" : "" );
		descricao.append(". Informação: " + informacao );
		System.out.println(descricao);
		return null;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	@Override
	public String toString() {
		return "Sobremesa{" +
				"quantidade=" + quantidade +
				", doce=" + doce +
				", informacao='" + informacao + '\'' +
				super.toString();
	}
}
