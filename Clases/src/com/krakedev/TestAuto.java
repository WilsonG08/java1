package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {

		// Intanciando de la clase
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		// Modificando los valores de los atributos del AUTO 1
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2019);
		auto1.setPrecio(25000);

		// Modificando los valores de los atributos del AUTO 2
		auto2.setMarca("Toyota");
		auto2.setAnio(2023);
		auto2.setPrecio(40000);

		// Mostrar los valores de los atributos del AUTO 1
		System.out.println("Marca del auto 1: " + auto1.getMarca());
		System.out.println("Año del auto 1: " + auto1.getAnio());
		System.out.println("Precio del auto 1: " + auto1.getPrecio());
		
		System.out.println("========================");

		// Mostrar los valores de los atributos del AUTO 2
		System.out.println("Marca del auto 2: " + auto2.getMarca());
		System.out.println("Año del auto 2: " + auto2.getAnio());
		System.out.println("Precio del auto 2: " + auto2.getPrecio());

	}

}
