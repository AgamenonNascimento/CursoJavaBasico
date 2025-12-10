package com.agamenon.aula27.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		System.out.println("O jogador 1 é = X:");
		System.out.println("O jogador 2 é = O:");
		
		boolean ganhou = false;
		char sinal = 'X';
		int linha = 0, coluna =0;
		
		while(!ganhou) {
			if (jogoDaVelha.vezJodador1()) {
				System.out.println("vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else {
				System.out.println("vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);
			jogoDaVelha.validarJogada(linha, coluna, sinal);
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 venceu");
			}else if(jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 venceu");
			}else if (jogoDaVelha.jogada > 9) {
				ganhou = true;
				System.out.println("Deu velha !!!");
			}
		 }

		}
		
		static int valor(String tipoValor, Scanner scan) {
			int valor=0;
			boolean valorValido = false;
			while(!valorValido) {
				System.out.println("Entre com a" + tipoValor + " (1, 2 ou 3)");
				valor = scan.nextInt();
				if (valor >=1 && valor <=3) {
					valorValido = true;					
				}else {
					System.out.println("Entrada inválida tente novamente :");
				}
			}
			valor--;
			return valor;
		}
	}






