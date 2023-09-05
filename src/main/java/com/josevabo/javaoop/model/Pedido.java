package com.josevabo.javaoop.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private List<Produto> produtos;
	private Solicitante solicitante;

	public Pedido(String descricao, Solicitante solicitante) {
		this.descricao = descricao;
		this.data = LocalDateTime.now();
		this.solicitante = solicitante;
		this.produtos = new ArrayList<>();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}



	@Override
	public String toString() {
		return "Pedido{" +
				"descricao='" + descricao + '\'' +
				", data=" + data +
				", web=" + web +
				", produtos='" + produtos.toString() + '\'' +
				", solicitante='" + solicitante.getNome() + '\'' +
				'}';
	}

}
