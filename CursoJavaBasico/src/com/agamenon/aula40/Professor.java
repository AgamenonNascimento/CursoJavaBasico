package com.agamenon.aula40;

public class Professor extends Pessoa {
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double clacularSalarioLiquido() {
		return 0;
	}
	
	public String obterEiquetaEndereco() {
		String s = "Nome do professor " + super.getNome() + "\n" ;
				s += "Endereço : " + super.getEndereco()+ "\n";
				
		return s;
	}
	
	
}
