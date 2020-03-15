package com.diego.designpatters;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados não podem ser aprovados!");
		
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está reprovado!");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

}
