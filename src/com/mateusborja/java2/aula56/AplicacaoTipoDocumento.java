/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula56;

public class AplicacaoTipoDocumento {

	public static void main(String[] args) {

		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumero());

		}

		System.out.println();
		Pessoa pf = new Pessoa();
		pf.setNomePessoa("Joao Honorio");
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumero());
		System.out.println(pf);

		Pessoa pj = new Pessoa();
		pj.setNomePessoa("Mateus Borja");
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumero());
		System.out.println(pj);
		
		

	}

}
