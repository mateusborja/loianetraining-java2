/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 54 enum como classe, metodo, construtor e atributos
package com.mateusborja.java2.aula54;

public enum DiaSemanaEnum {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor;
	
	private DiaSemanaEnum(int valor) {
		this.valor = valor;
		
	}
	
	public int getValor() {
		return valor;
	}

}
