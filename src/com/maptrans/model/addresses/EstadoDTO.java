package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class EstadoDTO extends GenericDTO {

	private String descricao;
	private PaisDTO pais;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PaisDTO getPais() {
		return pais;
	}

	public void setPais(PaisDTO pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EstadoDTO [descricao=");
		builder.append(descricao);
		builder.append(", pais=");
		builder.append(pais);
		builder.append("]");
		return builder.toString();
	}

}