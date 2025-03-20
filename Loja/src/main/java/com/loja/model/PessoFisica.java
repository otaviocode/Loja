package com.loja.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
@SequenceGenerator(name = "seq_pessoa_fisica", sequenceName = "seq_pessoa_fisica", allocationSize = 1, initialValue = 1)
public class PessoFisica extends Pessoa implements Serializable {
	/* Anything to remove this implement serializable! */

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String cpf;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataNascimento;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
