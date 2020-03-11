package com.diego.designpatters;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
