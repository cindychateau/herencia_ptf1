package com.codingdojo.cynthia;

public interface ManejarVehiculo {
	
	int aumento = 2;
	
	/* 3 Métodos
	 * Abstracto: aquellos que OBLIGAMOS a nuestra clase a implementar
	 * Default: no necesita ser implementado, lo creamos directamente en la interfaz
	 * Estáticos: pertenece a la interfaz
	 * */
	
	abstract void acelerar();
	abstract void desacelerar();
	
	default void manejar() {
		System.out.println("Estoy manejando mi vehiculo");
	}
	
}
