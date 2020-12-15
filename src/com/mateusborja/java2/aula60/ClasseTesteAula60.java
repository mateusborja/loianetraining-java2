/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 60 escopo de variaveis - classe teset
package com.mateusborja.java2.aula60;

public class ClasseTesteAula60 {
	
	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		
		escopo.setValor(10);
		
		//System.out.println(escopo.getValor()); //10
		System.out.println(escopo.calculaValor(20)); //20 ou 30?
		//System.out.println(escopo.getValor()); //10 ou 20?
		
		System.out.println(escopo.decremento());
		
		escopo.incremento();
		
	}

}
