package com.agamenon.aula34.labs;

public class Contador {
	private static int cont;
	
	public Contador() {
		cont++;
	}
	
	public static void inclementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
}
