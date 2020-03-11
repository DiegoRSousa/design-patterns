package com.diego.designpatters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeDescontoTeste {

	CalculadoraDeDesconto calculadora;
	Orcamento orcamento;
	
	
	@Before
	public void setup() {
		calculadora = new CalculadoraDeDesconto();
		orcamento = new Orcamento(1000);
		
	}
	
	@Test
	public void deveCalcularDescontoPorCincoItens() {
		orcamento.adicionaItem(new Item("Bateria", 300));
		orcamento.adicionaItem(new Item("Pneu Traseiro", 100));
		orcamento.adicionaItem(new Item("Roda Traseira", 240));
		orcamento.adicionaItem(new Item("Pneu Dianteiro", 100));
		orcamento.adicionaItem(new Item("Camara de Ar", 30));
		orcamento.adicionaItem(new Item("Oleo", 25));
		
		double descontFinal = calculadora.calcula(orcamento);
		assertEquals(100, descontFinal);
	}
	
	@Test
	public void deveCalcularDescontoPorMaisDeQuinentosReais() {
		orcamento.adicionaItem(new Item("Bateria", 300));
		orcamento.adicionaItem(new Item("Pneu Traseiro", 100));
		
		double descontFinal = calculadora.calcula(orcamento);
		assertEquals(70, descontFinal);
	}
}
