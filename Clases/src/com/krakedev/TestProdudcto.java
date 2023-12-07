package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Creacion de las 3 Variables
		Producto productoA;
		Producto productoB;
		Producto productoC;

		// Instancia de los tres objetos
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		// Modificacion de los atributos del producto 1
		productoA.nombre = "Presevativos DUO";
		productoA.descripcion = "Es un prodcuto para caballeros";
		productoA.precio = 2.50;
		productoA.stockActual = 50;

		// Modificacion de los atributos del producto 2
		productoB.nombre = "Paracetamol";
		productoB.descripcion = "Aliviar dolor y bajar la fiebre";
		productoB.precio = 1.50;
		productoB.stockActual = 25;

		// Modificacion de los atributos del producto 3
		productoC.nombre = "Cepillo de dientes";
		productoC.descripcion = "Es para cepillarse los dientes";
		productoC.precio = 1.00;
		productoC.stockActual = 10;

		// Mostrar los valores del producto 1
		System.out.println("Nombre del producto 1: " + productoA.nombre);
		System.out.println("Descripcion del producto 1: " + productoA.descripcion);
		System.out.println("Precio del producto 1: " + productoA.precio);
		System.out.println("Stock actual del producto 1: " + productoA.stockActual);

		System.out.println("==================================");

		// Mostrar los valores del producto 2
		System.out.println("Nombre del producto 2: " + productoB.nombre);
		System.out.println("Descripcion del producto 2: " + productoB.descripcion);
		System.out.println("Precio del producto 2: " + productoB.precio);
		System.out.println("Stock actual del producto 2: " + productoB.stockActual);

		System.out.println("==================================");

		// Mostrar los valores del producto 3
		System.out.println("Nombre del producto 3: " + productoC.nombre);
		System.out.println("Descripcion del producto 3: " + productoC.descripcion);
		System.out.println("Precio del producto 3: " + productoC.precio);
		System.out.println("Stock actual del producto 3: " + productoC.stockActual);

	}

}
