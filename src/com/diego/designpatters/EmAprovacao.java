package com.diego.designpatters;

public class EmAprovacao implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado");
	}
}
