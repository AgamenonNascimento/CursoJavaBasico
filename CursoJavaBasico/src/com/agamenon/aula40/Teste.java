package com.agamenon.aula40;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		aluno.setNome("Pedro");
		professor.setEndereco("Rua 3, num 3");
		professor.setNome("Paulo");
		
		System.out.println(pessoa.obterEiquetaEndereco());
		System.out.println(aluno.obterEiquetaEndereco());
		System.out.println(professor.obterEiquetaEndereco());
	}
	
	
	

}
