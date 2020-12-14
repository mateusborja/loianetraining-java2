/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 55 enum com metodos values e valuesOf - classe teste
package com.mateusborja.java2.aula55;

public class AplicacaoBebidas {

	public static void main(String[] args) {

		Bebidas b1 = Bebidas.CAPPUCCINO;

		System.out.println(b1.getQtde());

		Bebidas bebidas[] = Bebidas.values();

		System.out.println();
		for (int i = 0; i < bebidas.length; i++) {
			System.out.println(bebidas[i]);
		}

		bebidas[0] = Bebidas.CAPPUCCINO;

		System.out.println();
		for (Bebidas b : Bebidas.values()) {
			System.out.println(b);

		}

		System.out.println();
		for (Bebidas b : Bebidas.values()) {
			System.out.println(b.getTipo());

		}

		System.out.println();
		System.out.println(bebidas[0].getTipo());

		System.out.println();
		float ct = 0;
		for (Bebidas b : Bebidas.values()) {
			System.out.println(b.getValorUnidade());
			ct+= b.getValorUnidade();
			

		}
		
		System.out.println();
		System.out.println("Vlr total R$ " + ct);

	}

}
