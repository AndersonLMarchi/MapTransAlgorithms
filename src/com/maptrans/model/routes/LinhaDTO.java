package com.maptrans.model.routes;

import java.util.List;

import com.maptrans.core.GenericDTO;
import com.maptrans.model.companies.FrotaDTO;
import com.maptrans.model.companies.HorarioDTO;
import com.maptrans.model.locations.PontosOnibusDTO;

public class LinhaDTO extends GenericDTO {

	private HorarioDTO horario;
	private FrotaDTO frota;
	private List<PontosOnibusDTO> pontos;
		
	public HorarioDTO getHorario() {
		return horario;
	}
	
	public void setHorario(HorarioDTO horario) {
		this.horario = horario;
	}
	
	public FrotaDTO getFrota() {
		return frota;
	}
	
	public void setFrota(FrotaDTO frota) {
		this.frota = frota;
	}
	
	public List<PontosOnibusDTO> getPontos() {
		return pontos;
	}

	public void setPontos(List<PontosOnibusDTO> pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LinhaDTO [horario=");
		builder.append(horario);
		builder.append(", frota=");
		builder.append(frota);
		builder.append(", pontos=");
		builder.append(pontos);
		builder.append("]");
		return builder.toString();
	}
	
}