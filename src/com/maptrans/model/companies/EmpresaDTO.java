package com.maptrans.model.companies;

import com.maptrans.core.GenericDTO;

public class EmpresaDTO extends GenericDTO {

	private String razaoSocial;
	private String contatoTelefone;
	private String contatoEletronico;
	private String cnpj;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getContatoTelefone() {
		return contatoTelefone;
	}
	
	public void setContatoTelefone(String contatoTelefone) {
		this.contatoTelefone = contatoTelefone;
	}
	
	public String getContatoEletronico() {
		return contatoEletronico;
	}
	
	public void setContatoEletronico(String contatoEletronico) {
		this.contatoEletronico = contatoEletronico;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empresa [razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", contatoTelefone=");
		builder.append(contatoTelefone);
		builder.append(", contatoEletronico=");
		builder.append(contatoEletronico);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append("]");
		return builder.toString();
	}
	
}