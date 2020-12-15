/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer � 3D Artist � Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula56;

public class Pessoa {

	private String nomePessoa;
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;

	public Pessoa() {
		super();
	}

	public Pessoa(String nomePessoa, TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.nomePessoa = nomePessoa;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Pessoa [nomePessoa= " + nomePessoa + ", tipoDocumento= " + tipoDocumento + ", numeroDocumento= "
				+ numeroDocumento + "]";
	}

}
