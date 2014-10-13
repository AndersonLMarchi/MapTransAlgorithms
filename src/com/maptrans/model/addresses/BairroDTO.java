package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class BairroDTO extends GenericDTO {

	private String descricao;
	private CidadeDTO cidade;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public CidadeDTO getCidade() {
		return cidade;
	}
	
	public void setCidade(CidadeDTO cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BairroDTO [descricao=");
		builder.append(descricao);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append("]");
		return builder.toString();
	}
		
}