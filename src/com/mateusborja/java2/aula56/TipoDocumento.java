/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 56 enum com metodo abstrato
package com.mateusborja.java2.aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumero() {
			return GeraCpfCnpj.cpf();
		}
	},
	CNPJ {
		@Override
		public String geraNumero() {
			return GeraCpfCnpj.cnpj();
		}
	};

	public abstract String geraNumero();

}
