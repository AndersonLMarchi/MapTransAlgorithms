package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class PaisDTO extends GenericDTO {

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaisDTO [id=");
		builder.append(super.getCodigo());
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
}