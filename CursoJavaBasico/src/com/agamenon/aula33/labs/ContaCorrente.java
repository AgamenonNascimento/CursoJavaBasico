package com.agamenon.aula33.labs;

public class ContaCorrente {
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public ContaCorrente() {}

	public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial,
			double valorEspecialUsado, double saldo) {
		super();
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setEspecial(especial);
		this.setLimiteEspecial(limiteEspecial);
		this.setValorEspecialUsado(valorEspecialUsado);
		this.setSaldo(saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public boolean realizarSaque(double quantiaASacar) {
		
		//tem saldo na conta
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}else {
			if (especial) {//verrifica limite especial
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
				
			}else {
				return false;//não é especial
			}
		}
		
	}
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo da Conta : R$ " + saldo);
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	

}
