/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 54 enum com construtor, metodo e atributo
package com.mateusborja.java2.aula54;

public class Formulario {

	enum Genero {
		FEMININO('F'), MASCULINO('M');

		private final char valor;

		Genero(char valor) {
			this.valor = valor;
		}
		
		public char getValor() {
			return valor;
		}
	}

	private String nome;
	private Genero genero;

	public Formulario() {
	}

	public Formulario(String nome, Genero genero) {
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
