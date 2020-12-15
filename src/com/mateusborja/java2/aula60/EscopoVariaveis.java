/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 60 escopo de variaveis - classe def
package com.mateusborja.java2.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor) {
		// this.valor = valor + 10;
		valor = valor + 10;
		return valor;
	}

	public int decremento() {
		int valor = 5;

		if (true) {
			valor--;
		}
		// this.valor = valor; // referencia o valor global atributo da classe
		return valor;
	}

	public void incremento() {

		boolean flag = true;

		if (flag) {
			for (int i = 0; i < 10; i++) {
				int num = i;
				num++;
				System.out.print(num + " ");

			}
		}
	}

}
