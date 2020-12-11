/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula54;

import com.mateusborja.java2.aula54.Formulario.Genero;

public class AplicacaoFormulario {
	
	public static void main(String[] args) {
		
		Formulario f1 = new Formulario("Joao Honório", Genero.MASCULINO);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getGenero());
		System.out.println(f1);
	}

}
