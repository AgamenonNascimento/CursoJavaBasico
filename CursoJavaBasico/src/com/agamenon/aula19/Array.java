package com.agamenon.aula19;

public class Array {

	public static void main(String[] args) {
		
		
		double[]temperaturas = new double[365];
		temperaturas [0] = 31.5;
		temperaturas [1] = 32;
		temperaturas [2] = 33.7;
		temperaturas [3] = 34;
		temperaturas [4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do Array é: " + temperaturas.length);
		
		//mostra o endereço de memoria do array
		System.out.println("Os valores do Array : " + temperaturas);
		
		for (int i = 0; i< temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " +(i+1)+ " é: " + temperaturas[i]);
			
		}
		
		//for melhorado precisa java > 5.0- acesso somente o valor
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
