package com.josevabo.javaoop.model;

import com.josevabo.javaoop.exception.PesoInvalidoException;

import java.util.HashSet;
import java.util.Set;

public class Comida extends Produto{

	private float peso;
	private boolean vegano;
	private String ingredientes;
	private Set<String> tags;

	public Comida(float peso, boolean vegano, String ingredientes, String nome, float valor, Integer codigo) {
		super(nome, valor, codigo);
		if(peso<0) {
			throw new PesoInvalidoException("Peso da comida deve ser maior que zero");
		}
		this.peso = peso;
		this.vegano = vegano;
		this.ingredientes = ingredientes;
		this.tags = new HashSet<>();
	}


	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void incluirTag(String tag) {
		this.tags.add(tag);
	}

	@Override
	public String imprimirResumo() {
		StringBuilder descricao = new StringBuilder();
		descricao.append(String.format("Esta refeição pesa %.2fg", peso));
		descricao.append(isVegano() ? "é vegana, " : "" );
		descricao.append("e possui os ingredientes " + ingredientes );
		if(tags.size()>0) descricao.append(". Tags: " + tags.toString());
		System.out.println(descricao);
		return null;
	}

	@Override
	public String toString() {
		return "Comida{" +
				"peso=" + peso +
				", vegano=" + vegano +
				", ingredientes='" + ingredientes + '\'' +
				super.toString();
	}
}
