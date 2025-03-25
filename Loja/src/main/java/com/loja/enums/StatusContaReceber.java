package com.loja.enums;

public enum StatusContaReceber {

	COBRANCA("Pay"), VENCIDA("Overdue"), ABERTA("Open"), QUITADA("Paid");

	StatusContaReceber(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
