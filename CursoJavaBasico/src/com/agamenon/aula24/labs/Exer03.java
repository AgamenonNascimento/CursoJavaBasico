package com.agamenon.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		LivroLivraria livro = new LivroLivraria();
		livro.nome = "Mastering Ext Js";
		livro.autor ="Loiane Groner";
		livro.numPaginas=358;
		livro.isbn="1782164006";
		livro.preco=316.64;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Preço: R$ " + livro.preco);
	}

}
