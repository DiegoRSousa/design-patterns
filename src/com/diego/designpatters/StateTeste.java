package com.diego.designpatters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StateTeste {

	Orcamento orcamento;
	
	@Before
	public void setup() {
		orcamento = new Orcamento(500);
	}
	
	@Test
	public void deveAplicarDescontoExtraStatusEmAprovacao() {
		orcamento.aplicaDescontoExtra();
		assertEquals(475, orcamento.getValor());
	}
	
	@Test
	public void deveAplicarDescontoExtraStatusAprovado() {
		orcamento.aprovar();
		orcamento.aplicaDescontoExtra();
		assertEquals(490, orcamento.getValor());
	}
	
	@Test
	public void deveAlterarStatusParaAprovado() {
		orcamento.aprovar();
		EstadoDeUmOrcamento estadoAtual = orcamento.estadoAtual;
		assertEquals(Aprovado.class, estadoAtual.getClass());
	}
	
	@Test(expected = RuntimeException.class)
	public void deveLancarExcecaoAoAlterarParaEstadoInvalido() {
		orcamento.finalizar();
	}
	
	@Test(expected = RuntimeException.class)
	public void deveLancarExcecaoAoAplicarDescontoComEstadoReprovado() {
		orcamento.reprovar();
		orcamento.aplicaDescontoExtra();
	}
}