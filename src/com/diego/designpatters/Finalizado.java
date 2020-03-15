package com.diego.designpatters;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado!");
		
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já finalizado!");
	}
}
