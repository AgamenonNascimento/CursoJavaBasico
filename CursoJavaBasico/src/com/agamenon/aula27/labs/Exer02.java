package com.agamenon.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "457892";
		conta.agencia = "7821-X";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		
		System.out.println("Agência : " + conta.agencia);
		System.out.println("Número : " + conta.numero);
		conta.consultarSaldo();
		
		boolean saqueEfetuado = conta.realizarSaque(20);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("Saque não efetuaado - Saldo Insuficiente !!");
		}
		
		System.out.println("Deposito de R$ 10");
		conta.depositar(400);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}

	}

}
