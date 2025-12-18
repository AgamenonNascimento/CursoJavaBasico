package com.agamenon.aula43.labs;

public class Teste {

	public static void main(String[] args) {
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("12345");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		contaSimples.depositar(30);
		
		realizarSaque(contaSimples, 70);
		
		realizarSaque(contaSimples, 30);
		
		
		System.out.println("*** Teste Conta Poupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta Poupança");
		contaPoupanca.setNumConta("654321");
		contaPoupanca.setDiaRendimento(19);
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de R$ :" + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println("*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("3333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
		
		
		
	}	
		
		
		
		private static void   realizarSaque(ContaBancaria conta, double valor) {
			if(conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo = R$ " + conta.getSaldo());
			}else {
				System.out.println("Saldo Insulficiente para saque de R$ :" + valor + "; seu saldo é R$ :" + conta.getSaldo() );
			}
		
	}

}
