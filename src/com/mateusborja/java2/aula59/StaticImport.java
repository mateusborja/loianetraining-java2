/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 59 static import - classe teste
package com.mateusborja.java2.aula59;

import static java.lang.Math.*; //mod acesso static


public class StaticImport {
	
	public static void main(String[] args) {
		
		double num1 = 2;
		double num2 = 3;
		double num3 = 4;
		
		System.out.println(Math.pow(num1, num2)); // pow() metodo estatico
		System.out.println(Math.sqrt(num3));
		
		System.out.println(pow(num2, num3));
		
		System.out.println(sqrt(num3));
		
		
		
	}

}
