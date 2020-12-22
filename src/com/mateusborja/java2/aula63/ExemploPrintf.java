/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 63 printf metodo da Classe System
package com.mateusborja.java2.aula63;

import java.util.Locale;

public class ExemploPrintf {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Hello %s", "Olá Mundo!");
		System.out.println();
		System.out.printf("Hello %S", "Olá Mundo!");
		System.out.println();
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		
		System.out.printf("%n");
		
		int valor1 = 12345678;
		
		System.out.printf("%d", valor1);
		
		System.out.println();
		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);
		
		//flags
		
		System.out.println();
		String olaMundo = "Olá Mundo!";
		System.out.printf("%20s", olaMundo);
		System.out.println();
		System.out.printf("%-20s", olaMundo);
		
		System.out.println();
		System.out.printf("%+d", valor1);
		
		System.out.println();
		System.out.printf("%+015d", valor1);
		
		System.out.println();
		System.out.printf("%,d", valor1);
		
		int valor2 = -123456789;
		System.out.println();
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor1);
		
		System.out.println();
		System.out.printf("%.4f", pontoFlutuante);
		System.out.println();
		System.out.printf("R$%10.2f", pontoFlutuante);
		
		
		System.out.println();
		
		double precos[] = {1000, 12.54, 7843.567, 1 , 4.56789};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item ", (i + 1), precos[i]); // string, inteiro, preco
		}
		
		System.out.format("%S",	"Mateus Borja");
		
		//Java.util.Formater
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
