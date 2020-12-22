/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 64 classes aninhadas - classe interna
package com.mateusborja.java2.aula64;

public class Externa {

	private String texto = "Texto Externo";

	public void imprimiTexto() {
		System.out.println(texto);
	}

	public class Interna {

		private String texto = "Texto Interno";

		public void imprimiTexto() {
			System.out.println(texto);
			System.out.println(Externa.this.texto); // acessando classe externa
		}

	}

	public static void main(String[] args) {

		Externa externa = new Externa();
		Interna interna = externa.new Interna();

		externa.imprimiTexto();
		interna.imprimiTexto();

	}

}
