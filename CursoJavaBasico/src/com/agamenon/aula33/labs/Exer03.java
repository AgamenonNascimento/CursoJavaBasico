package com.agamenon.aula33.labs;

import java.util.Scanner;


public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do Aluno:");
		aluno.setNome(scan.next()); 
		
		System.out.println("Entre com o nome do curso:");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matricula:");
		aluno.setMatricula(scan.next());
		
		//aluno.nomeDisciplinas = new String[3];
		
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome da Disciplina" + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for (int i=0; i<aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo Notas da Disciplina " + aluno.getNomeDisciplinas()[i]);
			for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota: " + (j+1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostarInfo();
		
		for(int i =0; i<aluno.getNomeDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Foi Aprovado");
			}else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Não foi aprovado");
			}
		}
	}


}


