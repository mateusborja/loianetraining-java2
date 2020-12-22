/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 64 classes aninhadas - classes anonimas

package com.mateusborja.java2.aula64;

public class Anonima {

	private String texto = "Texto Classe Anonima";

	public void imprimiTexto() {
		System.out.println(texto);
	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() {
			public void imprimiTexto() {
				System.out.println("qualquer texto o texto ");
			}
		};

		anonima.imprimiTexto();

		// interface - classe anonima
		Texto texto = new Texto() {

			@Override
			public void imprimiTexto() {
				System.out.println("qualquer texto o texto - interface");

			}
		};

		texto.imprimiTexto();

	}

}
