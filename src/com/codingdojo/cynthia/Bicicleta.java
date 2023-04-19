package com.codingdojo.cynthia;

public class Bicicleta extends Vehiculo implements ManejarVehiculo {
	
	//Constructor de bici
	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas) {
		super(anio, marca, modelo, color, ruedas);
	}
	
	public void acelerar() {
		System.out.println("Voy a pedalear mas rapido");
		this.velocidad += 1;
		System.out.println("Mi velocidad es:"+this.velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Voy a bajar mis pies poco a poco");
		this.velocidad -= 1;
		System.out.println("Mi velocidad es:"+this.velocidad);
	}
	
}
