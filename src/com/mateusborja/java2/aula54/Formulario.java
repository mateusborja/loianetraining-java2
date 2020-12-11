/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula54;

public class Formulario {

	enum Genero {
		FEMININO('F'), MASCULINO('M');

		private char valor;

		Genero(char valor) {
			this.valor = valor;
		}
	}

	private String nome;
	private Genero genero;

	public Formulario() {
	}

	public Formulario(String nome, Genero genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Formulario [nome=" + nome + ", genero=" + genero + "]";
	}

}
