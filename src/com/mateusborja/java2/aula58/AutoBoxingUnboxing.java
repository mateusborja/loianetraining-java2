/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */

package com.mateusborja.java2.aula58;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {

		// autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 45.5f;
		Double num12 = 12.5;
		Boolean flag2 = true;
		Character b = 'b';

		// autounboxing
		int num1 = num9;
		double num2 = num12;
		float num3 = num11;

		// autoboxing em exmpressoes
		num1++;
		num2++;
		++num3;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		//mal uso do autoboxing // melhor utilizar os tipos primitivos
		Double n1 = 15.5;
		Double n2 = 5.5;
		Double media = (n1 + n2) / 2;
		System.out.println(media);

	}

}
