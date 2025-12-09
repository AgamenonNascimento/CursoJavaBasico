package com.agamenon.aula27.labs;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		
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
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo da Conta : R$ " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
	
}
