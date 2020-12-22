/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 64 classes aninhadas - classe local

package com.mateusborja.java2.aula64;

public class ExternaDois {
	
	public void metodoQualquer() {

		class ClasseLocal {
			
			private String texto = "Texo classe Local";
			
			public void imprimiTexto() {
				System.out.println(texto);
			}
		}
		
		ClasseLocal local = new ClasseLocal();
		local.imprimiTexto();
		
		
	}
	
	public static void main(String[] args) {
		
		ExternaDois externaDois = new ExternaDois();
		externaDois.metodoQualquer();
		
		
	}

}
