package com.loja.model;

import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", allocationSize = 1, initialValue = 1)
public class Acesso implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String descricao; /* Acess example: ROLE_ADMIN or ROLE_SECRETARY */

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
	private Long id;

	@Override
	public String getAuthority() {
		return this.descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acesso other = (Acesso) obj;
		return Objects.equals(id, other.id);
	}

}
