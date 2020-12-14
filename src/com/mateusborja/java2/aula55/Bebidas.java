/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 55 enum com metodos values e valuesOf - exemplo
package com.mateusborja.java2.aula55;

public enum Bebidas {

	AGUA(4.75f, "500 ml", "Água") {
		@Override
		public float calcularVenda(int quantidade) {
			float venda = quantidade * getValorUnidade();
			return venda;
		}
	},
	REFRIGERANTE(8f, "400 ml", "Refrigerante") {
		@Override
		public float calcularVenda(int quantidade) {
			float venda = quantidade * getValorUnidade();
			return venda;
		}
	},

	SUCONATURAL(10f, "300 ml", "Suco Natural") {
		@Override
		public float calcularVenda(int quantidade) {
			float venda = quantidade * getValorUnidade();
			return venda;
		}

	},
	CAFE(5f, "200 ml", "Café") {
		@Override
		public float calcularVenda(int quantidade) {
			float venda = quantidade * getValorUnidade();
			return venda;
		}

	},
	CAPPUCCINO(7.75f, "300ml", "Cappuccino") {
		@Override
		public float calcularVenda(int quantidade) {
			float venda = quantidade * getValorUnidade();
			return venda;
		}
	};

	private float valorUnidade;
	private String quantidade;
	private String tipo;

	Bebidas(float valorUnidade, String qtde, String tipo) {
		this.valorUnidade = valorUnidade;
		this.quantidade = qtde;
		this.tipo = tipo;
	}

	public float getValorUnidade() {
		return valorUnidade;
	}

	public String getQtde() {
		return quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public abstract float calcularVenda(int qtde);

}
