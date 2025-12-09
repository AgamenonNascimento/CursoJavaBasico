package com.agamenon.aula27.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do Aluno:");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso:");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula:");
		aluno.matricula = scan.next();
		
		//aluno.nomeDisciplinas = new String[3];
		
		for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da Disciplina" + i);
			aluno.nomeDisciplinas[i] = scan.next();			
		}
		
		for (int i=0; i<aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo Notas da Disciplina " + aluno.nomeDisciplinas[i]);
			for(int j=0; j<aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota: " + (j+1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostarInfo();
		
		for(int i =0; i<aluno.notasDisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Foi Aprovado");
			}else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - Não foi aprovado");
			}
		}
	}

}
