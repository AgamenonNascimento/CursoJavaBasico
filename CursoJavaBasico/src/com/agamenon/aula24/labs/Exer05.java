package com.agamenon.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "457892";
		conta.agencia = "7821-X";
		conta.especial = false;
		conta.limiteEspecial = 0;
		conta.saldo = 12245.42;
		
		
		System.out.println("Agência : " + conta.agencia);
		System.out.println("Número : " + conta.numero);
		System.out.println("Saldo da Conta : R$ " + conta.saldo);
		

	}

}
