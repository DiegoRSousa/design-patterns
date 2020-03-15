package com.diego.designpatters;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados n�o podem ser aprovados!");
		
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� reprovado!");
		
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

}
