/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 55 enum com metodos values e valuesOf - classe teste

package com.mateusborja.java2.aula55;

public class AplicacaoDiaSemana02 {
	
	public static void main(String[] args) {
		
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dias = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println();
		System.out.println(dias);


		
		
		
		
		
	}

}
