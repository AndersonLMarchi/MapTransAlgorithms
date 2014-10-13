package com.maptrans.model.locations;

import java.util.List;

import com.maptrans.core.GenericDTO;
import com.maptrans.model.addresses.EnderecoDTO;
import com.maptrans.model.routes.LinhaDTO;

public class PontosOnibusDTO extends GenericDTO {
	
	private long lartitude;
	private long longitude;
	private EnderecoDTO endereco;
	private List<LinhaDTO> linhas;
	
	public long getLartitude() {
		return lartitude;
	}
	
	public void setLartitude(long lartitude) {
		this.lartitude = lartitude;
	}
	
	public long getLongitude() {
		return longitude;
	}
	
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	public EnderecoDTO getEndereco() {
		return endereco;
	}
	
	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	public List<LinhaDTO> getLinhas() {
		return linhas;
	}
	
	public void setLinhas(List<LinhaDTO> linhas) {
		this.linhas = linhas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PontosOnibusDTO [lartitude=");
		builder.append(lartitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", linhas=");
		builder.append(linhas);
		builder.append("]");
		return builder.toString();
	}
	
}