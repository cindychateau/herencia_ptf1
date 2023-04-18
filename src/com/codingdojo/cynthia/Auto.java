package com.codingdojo.cynthia;

public class Auto extends Vehiculo {

	private String placas;
	
	public Auto(int anio, String marca, String modelo, String color, int ruedas, String placas) {
		super(anio, marca, modelo, color, ruedas);
		this.placas = placas;
	}
	
	/*Polimorfismo: tener el mismo método a través de clases PERO con distintos comportamientos*/
	public void imprimir() {
		System.out.println("El auto es del anio:"+this.anio+" Placas:"+this.placas);
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
	
}
