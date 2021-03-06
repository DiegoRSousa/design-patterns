package com.diego.designpatters;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento))
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
