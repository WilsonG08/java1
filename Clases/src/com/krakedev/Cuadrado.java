package com.krakedev;

public class Cuadrado {
	// Atributo
	int lado;
	
	public double calcularArea() {
		double area;
		area = lado*lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = lado*4;
		return perimetro;
	}

}
