/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 55 enum com metodos values e valuesOf - classe teste
package com.mateusborja.java2.aula55;

public class AplicacaoDiaSemana01 {

	public static void main(String[] args) {

		DiaSemana dias[] = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);

		}

		System.out.println();
		for (DiaSemana d : DiaSemana.values()) {
			System.out.println(d);
		}

		System.out.println();
		for (DiaSemana d : dias) {
			System.out.println(d.getDiaSemana());

		}

	}

}
