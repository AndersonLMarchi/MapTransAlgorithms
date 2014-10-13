package com.maptrans.model.addresses;

import com.maptrans.core.GenericDTO;

public class EnderecoDTO extends GenericDTO {

	private int numero;
	private LogradouroDTO logradouro;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public LogradouroDTO getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(LogradouroDTO logradouro) {
		this.logradouro = logradouro;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnderecoDTO [numero=");
		builder.append(numero);
		builder.append(", logradouro=");
		builder.append(logradouro);
		builder.append("]");
		return builder.toString();
	}
	
}