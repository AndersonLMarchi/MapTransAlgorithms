package com.maptrans.model.companies;

import com.maptrans.core.GenericDTO;

public class VeiculoDTO extends GenericDTO {

	private String identificador;
	private int anoFabricacao;
	private String marca;
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculos [identificador=");
		builder.append(identificador);
		builder.append(", anoFabricacao=");
		builder.append(anoFabricacao);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
	
}
