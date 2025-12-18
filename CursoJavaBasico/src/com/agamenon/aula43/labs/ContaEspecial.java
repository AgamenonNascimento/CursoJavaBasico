package com.agamenon.aula43.labs;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s = " Conta Especial :" + "\n";
		s += " Limite: " + limite + "\n";
		s += super.toString();
		return s;
	}
	
	public boolean sacar(double valor) {
		
		double saldoComLimite = getSaldo()+ limite;
		if ((saldoComLimite - valor) >=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
		
				
	}
}
