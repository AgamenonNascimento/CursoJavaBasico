package com.agamenon.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Agamenon");
		//contato.setEndereco("Kings Land");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamento tem - um Endereco
		
		Endereco end = new Endereco();
		
		end.setNomeRua("Avenida 1");
		end.setNumero("3");
		end.setComplemento("em frente a igreja");
		end.setCidade("Paço do Lumiar");
		end.setEstado("MA");
		end.setCep("65.137-000");
		
		contato.setEndereco(end);
		
		//relacionamento tem - um telefone
		
		Telefone tel = new Telefone();
		tel.setTipo("celular");
		tel.setDdd("98");
		tel.setNumero("98132-6288");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("casa");
		tel2.setDdd("98");
		tel2.setNumero("3243 - 1155");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//contato.setTelefone(tel);
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getNomeRua());
		}
		
		//System.out.println(contato.getTelefone());
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for (Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}

	}

}
