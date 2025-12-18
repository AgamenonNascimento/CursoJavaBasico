package com.agamenon.aula43.labs.Exer02;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("740.946.890-44");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("90.929.030/0001-70");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setNome("696.218.070-50");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("05.619.759/0001-70");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("581.489.910-73");
		
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("20.032.664/0001-40");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (Contribuinte c: contribuintes) {
			System.out.println(c.toString());
		}
		

	}

}
