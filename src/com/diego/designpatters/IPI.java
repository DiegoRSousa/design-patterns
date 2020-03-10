package com.diego.designpatters;

public class IPI implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.03;
	}
}
