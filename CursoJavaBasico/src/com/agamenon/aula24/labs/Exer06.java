package com.agamenon.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.nome = "Loiane";
		contato.email = "loiane@loiane.com";
		contato.endereco ="Av Brasil, S/N";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "9999-9999";
		contato.telefones[1] = "98 98245-2526";
		
		System.out.println("Nome: " + contato.nome);
		System.out.println("Email: " + contato.email);
		System.out.println("Endereço: " + contato.endereco);
		System.out.println();
		System.out.println("Telefones : " + contato.telefones[0]+ " - " + contato.telefones[1] );
		

	}

}
