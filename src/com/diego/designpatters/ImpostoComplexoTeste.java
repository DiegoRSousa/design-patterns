package com.diego.designpatters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ImpostoComplexoTeste {

	Orcamento orcamento;
	
	@Before
	public void setup() {
		orcamento = new Orcamento(500);
	}
	
	@Test
	public void deveCalcularImpostoComplexo() {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		assertEquals(115, iss.calcula(orcamento));
	}
}
