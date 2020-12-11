/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 54 enum classe teste
package com.mateusborja.java2.aula54;

import java.util.ArrayList;

import com.mateusborja.java2.aula54.Formulario.Genero;

public class AplicacaoFormulario {
	
	public static void main(String[] args) {
		
		ArrayList<Formulario> listaFormularios = new ArrayList<Formulario>();
		
		Formulario f1 = new Formulario("Joao Honório", Genero.MASCULINO);
		Formulario f2 = new Formulario("Leda Honório", Genero.FEMININO);
		Formulario f3 = new Formulario("Jose Alexandre GB", Genero.MASCULINO);
		
		listaFormularios.add(f1);
		listaFormularios.add(f2);
		listaFormularios.add(f3);
		
		
		
		System.out.println(f1.getNome());
		System.out.println(f1.getGenero());
		System.out.println(f1);
		
		System.out.println(listaFormularios);
	}

}
