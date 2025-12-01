package com.agamenon.aula20;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double notasAlunos[][] = new double[30][4];
		
		notasAlunos[0][0]= 10;
		notasAlunos[0][1]= 7;
		notasAlunos[0][2]= 9;
		notasAlunos[0][3]= 9.5;
		
		notasAlunos[1][0]= 9;
		notasAlunos[1][1]= 8;
		notasAlunos[1][2]= 7;
		notasAlunos[1][3]= 9;
		
		notasAlunos[2][0]= 8;
		notasAlunos[2][1]= 9;
		notasAlunos[2][2]= 10;
		notasAlunos[3][3]= 7;
		
		for (int i =0;i<notasAlunos.length;i++) {
			for(int j=0;j<notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();			
		}
		
		System.out.println("Calculando a media dos Alunos: ");
		
		double soma;
		for (int i =0;i<notasAlunos.length;i++) {
			soma = 0;
		
			for(int j=0;j<notasAlunos[i].length;j++) {
				soma += notasAlunos[i][j];
			}
				System.out.println("A média do aluno : " +(i+1) + " é = " +(soma/4)); 
				
				System.out.println();
	}
		double[][] notasAlunos2 = {{7,8,9,10},{10,9,8,7},{8,7,6,10,5}};
		
		System.out.println("Notas alunos 2");
		
		for (int i =0;i<notasAlunos2.length;i++) {
			for(int j=0;j<notasAlunos2[i].length;j++) {
				System.out.print(notasAlunos2[i][j] + " - ");
			}
			System.out.println();	

	}
}
}
