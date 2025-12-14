package com.agamenon.aula34.labs;

public class Exer01 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.inclementar();
		
		imprimirValor();
		
		Contador.inclementar();
		
		
		
		imprimirValor();
	

	}

}
