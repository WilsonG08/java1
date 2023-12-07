package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {

		// Intanciando de la clase
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		// Modificando los valores de los atributos del AUTO 1
		auto1.marca = "Chevrolet";
		auto1.anio = 2019;
		auto1.precio = 25000;

		// Modificando los valores de los atributos del AUTO 2
		auto2.marca = "Toyota";
		auto2.anio = 2023;
		auto2.precio = 40000;

		// Mostrar los valores de los atributos del AUTO 1
		System.out.println("Marca del auto 1: " + auto1.marca);
		System.out.println("Año del auto 1: " + auto1.anio);
		System.out.println("Precio del auto 1: " + auto1.precio);
		
		System.out.println("========================");

		// Mostrar los valores de los atributos del AUTO 2
		System.out.println("Marca del auto 2: " + auto2.marca);
		System.out.println("Año del auto 2: " + auto2.anio);
		System.out.println("Precio del auto 2: " + auto2.precio);

	}

}
