package com.krakedev;

public class TesteCalculadora {

	public static void main(String[] args) {

		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;

		// Definicion de la variable
		Calculadora calcu;

		// Instancia del objeto
		calcu = new Calculadora();

		// Acceso al objeto
		resultadoSuma = calcu.sumar(5, 3);
		resultadoResta = calcu.restar(10, 7);
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		resultadoDivision = calcu.division(64, 8);
		resultadoPromedio = calcu.promedio(10, 9, 8);

		System.out.println("RESULTADO SUMA: " + resultadoSuma);
		System.out.println("RESULTADO RESTA: " + resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: " + resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISION: " + resultadoDivision);
		System.out.println("RESULTADO PROMEDIO: " + resultadoPromedio);
		calcu.mostrarResultado();

	}

}
