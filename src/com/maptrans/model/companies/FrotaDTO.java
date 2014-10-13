package com.maptrans.model.companies;

import com.maptrans.core.GenericDTO;

public class FrotaDTO extends GenericDTO {

	private EmpresaDTO empresa;
	private VeiculoDTO veiculo;
	
	public EmpresaDTO getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}
	
	public VeiculoDTO getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(VeiculoDTO veiculo) {
		this.veiculo = veiculo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FrotaDTO [empresa=");
		builder.append(empresa);
		builder.append(", veiculo=");
		builder.append(veiculo);
		builder.append("]");
		return builder.toString();
	}
	
}