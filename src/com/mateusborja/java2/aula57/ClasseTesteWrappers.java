/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 57 classe wrappers
package com.mateusborja.java2.aula57;

public class ClasseTesteWrappers {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 100000l;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';

		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;
		Float num11 = 45.5f;
		Double num12 = 12.5;
		Boolean flag2 = true;
		Character b = 'b';

		Short num13 = new Short((short) 1);
		Byte num14 = new Byte((byte) 100);
		Integer num15 = new Integer(100);
		Long num16 = new Long(10000l);
		Float num17 = new Float(45.5f);
		Double num18 = new Double(25.5);
		Boolean flag3 = new Boolean(true);
		Character c = new Character('c');

		int num19 = Integer.parseInt("1000");
		System.out.println(num19);

		double num20 = Double.parseDouble("55.5");
		System.out.println(num20);

		System.out.println(c);
		System.out.println(flag3);
		System.out.println(num18);
		System.out.println(num10.equals(num16));

		System.out.println(num7.equals(num1));

		if (num7.equals(num1)) {
			System.out.println("Numeros iguais");
		} else {
			return;
		}

	}

}
