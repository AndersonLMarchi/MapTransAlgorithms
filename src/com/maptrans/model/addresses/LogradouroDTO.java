package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class LogradouroDTO extends GenericDTO {

	private String descricao;
	private String cep;
	private BairroDTO bairro;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public BairroDTO getBairro() {
		return bairro;
	}
	
	public void setBairro(BairroDTO bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Logradouro [descricao=");
		builder.append(descricao);
		builder.append(", cep=");
		builder.append(cep);
		builder.append(", bairro=");
		builder.append(bairro);
		builder.append("]");
		return builder.toString();
	}
	
}