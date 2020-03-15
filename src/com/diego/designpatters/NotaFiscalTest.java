package com.diego.designpatters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NotaFiscalTest {
	
	@Test
	public void deveConstruirNotaFiscal() {
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
		.paraEmpresa("Razao Social Ltda")
		.comCnpj("15674876000198")
		.comData()
		.comObservacoes("Novos produtos")
		.comItem(new ItemDaNota("Item1", 100))
		.comItem(new ItemDaNota("Item2", 150));
		
		NotaFiscal notaFiscal = builder.build();
		assertEquals("15674876000198", notaFiscal.getCnpj());
		assertEquals(12.5, notaFiscal.getImpostos());
		assertEquals(250, notaFiscal.getValorBruto());
		
	}
	
	
}
