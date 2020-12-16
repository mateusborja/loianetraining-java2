/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */
//aula 55 metodos values e valuesOf
package com.mateusborja.java2.aula55;

public enum DiaSemana {

	SEGUNDA("Dia 1"), TERCA("Dia 2"), QUARTA("Dia 3"), QUINTA("Dia 4"), SEXTA("Dia 5"), SABADO("Dia 6"),
	DOMINGO("Dia 7");

	private String diaSemana;

	DiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

}
