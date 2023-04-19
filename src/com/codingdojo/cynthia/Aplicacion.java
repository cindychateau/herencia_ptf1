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
		
		auto1.acelerar();
		auto1.manejar();
		auto1.acelerar();
		
		System.out.println("--------");
		
		//Bicicleta bici1 = new Bicicleta(2020, "Apache", "M123", "Rosa", 2);
		Bicicleta bici1 = new Bicicleta(2020, "Apache", "M123", "Rosa", 2);
		bici1.acelerar();
		bici1.acelerar();
		bici1.desacelerar();
		
		System.out.println("--------");
		
		Cuadrado cuadrado1 = new Cuadrado(10);
		System.out.println("El area del cuadrado es: "+cuadrado1.area());
		
		Triangulo triangulo1 = new Triangulo(10, 5);
		System.out.println("El area del triangulo es: "+triangulo1.area());
	}
	

}
