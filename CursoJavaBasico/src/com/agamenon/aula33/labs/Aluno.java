package com.agamenon.aula33.labs;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double [][] notasDisciplinas;
	
	public Aluno() {
		nomeDisciplinas= new String[3];
		notasDisciplinas= new double[3][4];
	}

	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		super();
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setNomeCurso(nomeCurso);
		this.setNomeDisciplinas(nomeDisciplinas);
		this.setNotasDisciplinas(notasDisciplinas);
		this.nomeDisciplinas= new String[3];
		this.notasDisciplinas= new double[3][4];
	}

	public double [][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double [][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostarInfo() {
		System.out.println("Nome :" + nome);
		System.out.println("Matricula :" + matricula);
		System.out.println("Nome do Curso :" + nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da Disciplina " + nomeDisciplinas[i]);
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean verificarAprovado(int indice) {
		double soma = 0;
		
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
				
		}
		
		double media = soma/4;
		if (media >= 7) {
			return true;
		}
		
		return false;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
		
	}
	
	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ]=nota;
	}
	
}
