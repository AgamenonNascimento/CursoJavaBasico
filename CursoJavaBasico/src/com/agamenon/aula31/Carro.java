package com.agamenon.aula31;

class Carro {
	
	String carro;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + 
	    this.capCombustivel * this.consumoCombustivel + " km");
	}

	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}

	}

