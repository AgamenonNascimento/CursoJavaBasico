package com.agamenon.aula43.labs.Exer02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		
		return this.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString() {
			String s = "*** Pessoa Jurídica ***" + "\n";
			s += super.toString();
			s += "; Cnpj : " + getCnpj();
			s += "; Imposto a ser Pago: R$ " + calcularImposto();	
   		return s;
	}
	
	

}
