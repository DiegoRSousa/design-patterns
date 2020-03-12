package com.diego.designpatters;

public class IPI extends Imposto {

	public IPI() {}
	public IPI(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.03;
	}
}
