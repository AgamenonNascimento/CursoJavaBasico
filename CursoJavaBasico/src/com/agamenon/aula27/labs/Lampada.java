package com.agamenon.aula27.labs;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean ligada;
	
	String[] tipos = new String[5];
	
	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	void mostrarEstado() {
		if (ligada) {
			System.out.println("A lâmpada está ligada");
		}else {
			System.out.println("A lâmpada está desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
		

}


