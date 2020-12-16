/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */
//aula 55 metodos values e valuesOf
package com.mateusborja.java2.aula55;

public enum DiaSemana {

	SEGUNDA("Dia 1") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();

		}
	},
	TERCA("Dia 2") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	},
	QUARTA("Dia 3") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	},
	QUINTA("Dia 4") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	},
	SEXTA("Dia 5") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	},
	SABADO("Dia 6") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	},
	DOMINGO("Dia 7") {
		@Override
		public String imprimirDia(DiaSemana diaSemana) {
			return getDiaSemana();
		}
	};

	private String diaSemana;

	DiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	abstract String imprimirDia(DiaSemana diaSemana);

}