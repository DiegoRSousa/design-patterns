package com.diego.designpatters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.estadoAtual = new EmAprovacao();
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}	
	
	public void aprovar() {
		estadoAtual.aprovar(this);
	}
	
	public void reprovar() {
		estadoAtual.reprovar(this);
	}
	
	public void finalizar() {
		estadoAtual.finalizar(this);
	}
}