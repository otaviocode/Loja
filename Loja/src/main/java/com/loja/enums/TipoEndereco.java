package com.loja.enums;

public enum TipoEndereco {

	COBRANCA("Cobrança"), ENTREGA("Entrega");

	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao; 
		/*The first description is the private that we create, and the second is what
		  we pass as parameter */				 
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}

}
