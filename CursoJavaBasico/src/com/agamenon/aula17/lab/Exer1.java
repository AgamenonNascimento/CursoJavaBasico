package com.agamenon.aula17.lab;

import java.util.Scanner;
/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem  caso  o  valor  seja  inválido  e  continue  pedindo  até  que  o 
usuário informe um valor válido.*/


public class Exer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean notaValida = false;
		double nota;
		
		do {
			System.out.println("Entre com uma nota ente 0 e 10:");
			nota =scan.nextDouble();
			
			if (nota >= 0 && nota <=10) {
				notaValida = true;
				System.out.println("Voçê digitou a nota: " + nota);
			}else {
				System.out.println("Digite novamente uma nota válida:");
				
			}
			
		}while(!notaValida);
		scan.close();
	}

}
