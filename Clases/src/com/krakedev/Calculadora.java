package com.krakedev;

public class Calculadora {

	public int sumar(int valor1, int valor2) {

		int resultado; // declarar la variable

		resultado = valor1 + valor2;

		return resultado;
	}

	public double restar(int valor1, int valor2) {
		double resultado;

		resultado = valor1 - valor2;

		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {

		double resultado;

		resultado = valor1 * valor2;

		return resultado;

	}

	public double division(double valor1, double valor2) {

		double resultado;

		resultado = valor1 / valor2;

		return resultado;
	}
	
	public double promedio(double valor1, double valor2, double valor3) {
		
		double resultado ;
		
		resultado = (valor1+valor2+valor3)/3;
		
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, sali al almuerzo. Regreso en 15 minutos");
	}
}
