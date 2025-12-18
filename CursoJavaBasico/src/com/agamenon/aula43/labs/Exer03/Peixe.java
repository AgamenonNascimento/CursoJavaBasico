package com.agamenon.aula43.labs.Exer03;

public class Peixe extends Animal {
	private String caracteristica;
	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristica = "Barbatanas e caldas";
		
	}
	
	
	public String getCaracteristica() {
		return caracteristica;
	}


	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: "+ caracteristica;
		return s;
	}


	

}
