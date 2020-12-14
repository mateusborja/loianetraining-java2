/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 55 enum com metodos values e valuesOf - exemplo
package com.mateusborja.java2.aula55;

public enum Bebidas {

	AGUA(4.75f, "500 ml", "Água"), REFRIGERANTE(8f, "400 ml", "Refrigerante"),
	SUCONATURAL(10f, "300 ml", "Suco Natural"), CAFE(5f, "200 ml", "Café"), CAPPUCCINO(7.75f, "300ml", "Cappuccino");

	private float valorUnidade;
	private String qtde;
	private String tipo;

	Bebidas(float valorUnidade, String qtde, String tipo) {
		this.valorUnidade = valorUnidade;
		this.qtde = qtde;
		this.tipo = tipo;
	}

	public float getValorUnidade() {
		return valorUnidade;
	}

	public String getQtde() {
		return qtde;
	}

	public String getTipo() {
		return tipo;
	}

}
