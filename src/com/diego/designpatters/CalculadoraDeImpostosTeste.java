package com.diego.designpatters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraDeImpostosTeste {
	
	Orcamento orcamento;
	CalculadorDeImpostos calculadora;
	
	@BeforeEach
	public void setup() {
		orcamento = new Orcamento(500);
		calculadora = new CalculadorDeImpostos();
	}
	
	@Test
	public void deveCalcularICMS() {
		Imposto icms = new ICMS();
		assertEquals(50, calculadora.realizaCalculo(orcamento, icms));
	}
	
	@Test
	public void deveCalcularISS() {
		Imposto iss = new ISS();
		assertEquals(30, calculadora.realizaCalculo(orcamento, iss));
	}
	
	@Test
	public void deveCalcularIPI() {
		Imposto ipi = new IPI();
		assertEquals(15, calculadora.realizaCalculo(orcamento, ipi));
	}
}
