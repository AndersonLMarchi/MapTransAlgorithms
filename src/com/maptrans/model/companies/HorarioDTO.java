package com.maptrans.model.companies;

import java.sql.Time;

import com.maptrans.core.GenericDTO;

public class HorarioDTO extends GenericDTO {

	private Time horaSaida;
	private Time horaChegada;
	
	public Time getHoraSaida() {
		return horaSaida;
	}
	
	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public Time getHoraChegada() {
		return horaChegada;
	}
	
	public void setHoraChegada(Time horaChegada) {
		this.horaChegada = horaChegada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HorarioDTO [horaSaida=");
		builder.append(horaSaida);
		builder.append(", horaChegada=");
		builder.append(horaChegada);
		builder.append("]");
		return builder.toString();
	}
		
}