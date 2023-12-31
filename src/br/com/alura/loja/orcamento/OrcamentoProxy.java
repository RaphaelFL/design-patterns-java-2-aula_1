package br.com.alura.loja.orcamento;

import java.math.BigDecimal;


public class OrcamentoProxy {
	
	private BigDecimal valor;
	private Orcamento orcamento;
	
	public OrcamentoProxy( Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	public BigDecimal getValor() {
		if(valor == null) {
			this.valor = orcamento.getValor();
		}
		return getValor();
	}
	
}
