package com.flexpag.paymentscheduler.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class PagamentoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NonNull
	private String produto;
	
	@Column
	@NonNull
	private String formaDePagamento;
	
	@Column
	@NonNull
	private LocalDate dataAgendada;
	
	@Column
	@NonNull
	private String valor;
	
	
	
	@Column
	private String status = "pending";

	

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	

	public LocalDate getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(LocalDate dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
