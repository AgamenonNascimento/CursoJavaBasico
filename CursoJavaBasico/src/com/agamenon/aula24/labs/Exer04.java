package com.agamenon.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "Mastering Ext Js";
		livro.autor ="Loiane Groner";
		livro.numPaginas=358;
		livro.isbn="1782164006";
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		
		livro.emprestadoPara = "Agamenon";
		
		System.out.println("Nome do livro: " + livro.nome);
		
		System.out.println("Emprestado para: " + livro.emprestadoPara);
		
		

	}

}
