package com.agamenon.aula26;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumo;
	
	void exibirAutonomia() {
		System.out.println(" A autonomia é: " + capCombustivel * consumo + " Km");
	}
	
	double obterAutonomia() {
		System.out.println("O método obter autonomia foi chamado !");
		return capCombustivel * consumo;
	}

}
