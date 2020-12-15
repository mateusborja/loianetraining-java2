/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula61;

public class PassagemParametros {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato2", "2345 6789", "contato2@mail.com");
		int valor = 10;

		System.out.println("\n***ORIGINALS");
		System.out.println(contato);
		System.out.println(valor);

		passagemParamentro(valor, contato);

		System.out.println("\n***EXAMPLE 1");
		System.out.println(contato);
		System.out.println(valor);

		passagemParametroS2(valor, contato);

		System.out.println("\n***EXAMPLE 2");
		System.out.println(contato);
		System.out.println(valor);

	}

	public static void passagemParamentro(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		contato = new Contato("Contato1", "1234 5678", "contat1@mail.com");
	}

	public static void passagemParametroS2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		contato.setNome("Contato" + novoValor++);

	}

}
