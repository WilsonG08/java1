package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// Instanciar
		Fecha fecha1 = new Fecha(0, 0, 0);
		Fecha fecha2 = new Fecha(1999, 3, 7);

		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(18);

		System.out.println(fecha1.getAnio());
		System.out.println(fecha2.getAnio());

	}

}
