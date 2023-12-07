package com.krakedev;

public class TestPersona {

	// Esto es un comentatio
	/*
	 * Comentario de varios lineas
	 * 
	 */
	public static void main(String[] args) {
		Persona p; // 1. Declaro una variable p de tipo de Persona
		// Declaro e instacion en la misma linea
		Persona p2 = new Persona();

		p = new Persona(); // 2. Instanciar (crear) un objeto Persona, referencias con p

		// 3. Accedo a los atributos, leo sus valores y los imprimo en la consola
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.edad);

		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;

		System.out.println("--------------------");

		// 5. Accedo a los atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.edad);

		p2.nombre = "Anngela";

		System.out.println("*******************");
		System.out.println("p.nombre : " + p.nombre);
		System.out.println("p2.nombre : " + p2.nombre);

	}

}
