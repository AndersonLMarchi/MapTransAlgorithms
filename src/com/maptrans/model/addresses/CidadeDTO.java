package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class CidadeDTO extends GenericDTO {

	private String nome;
	private EstadoDTO estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CidadeDTO [nome=");
		builder.append(nome);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}

}