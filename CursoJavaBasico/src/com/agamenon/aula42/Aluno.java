package com.agamenon.aula42;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	
	
	public Aluno() {
		super();
	
		
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
		
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double obterMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	/*public String obterEiquetaEndereco() {
		String s = "Nome do Aluno: " + super.getNome() + "\n" ;
				s += "Endereço: " + super.getEndereco()+ "\n";
				
		return s;
	}*/
	
	

}
