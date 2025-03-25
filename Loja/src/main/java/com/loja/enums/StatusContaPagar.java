package com.loja.enums;

public enum StatusContaPagar {

	COBRANCA("Pay"), VENCIDA("Overdue"), ABERTA("Open"), QUITADA("Paid"), NEGOCIADA("Renegotiated"), ALUGUEL("Aluguel"),
	FUNCIONARIO("Funcionario");

	StatusContaPagar(String descricao) {
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
