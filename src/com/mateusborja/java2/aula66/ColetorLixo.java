/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 65 garbage collector - coletor de lito
package com.mateusborja.java2.aula66;

import com.mateusborja.java2.aula61.Contato;

public class ColetorLixo {

	public static void obterMemoriaUsada() {

		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime(); // padrao singleton

		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);

	}

	public static void main(String[] args) throws Exception {

		Contato[] contatos = new Contato[10000];

		for (int i = 0; i < contatos.length; i++) {
			Contato contato = new Contato("Contato" + i, "1234-56789" + i, "Contato" + i + "mail@mail.com");
			contatos[i] = contato;

		}

		System.out.println("Contatos criados");

		obterMemoriaUsada();

		contatos = null;

		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();


		
		try {
			
			System.out.println("Contatos removidos da memória");
			obterMemoriaUsada();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Erros Message!");
		}
	}

}
