package com.nelioalves.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.nelioalves.cursomc.enums.EstadoPagamento;


@Entity
public class PagamentoComBoleto extends Pagamento{
	
	private static final long serialVersionUID = 1L;

	private Date dataDeVencimento;
	private Date dataDePagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			Date dataDeVencimento, Date dataDePagamento) {
		super(id, estado, pedido);
		this.dataDeVencimento = dataDeVencimento;
		this.dataDePagamento = dataDePagamento;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}
	
	
}
