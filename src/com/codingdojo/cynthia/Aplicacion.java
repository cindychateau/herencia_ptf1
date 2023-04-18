package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		
		//Vehiculo barco = new Vehiculo(2015, "Barco123", "Modelo de Barco", "Blanco", 0)
		Vehiculo barco = new Vehiculo(2015, "Barco123", "Modelo de Barco", "Blanco", 0);
		System.out.println(barco.getMarca());
		
		//Auto auto1 = new Auto(2010, "Honda", "Civic", "Rojo", 4, "ABC123");
		Auto auto1 = new Auto(2010, "Honda", "Civic", "Rojo", 4, "ABC123");
		System.out.println(auto1.getMarca());
		
		auto1.imprimir();
	}

}
