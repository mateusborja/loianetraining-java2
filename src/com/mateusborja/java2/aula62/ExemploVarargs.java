/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 62 varargs - classe teste
package com.mateusborja.java2.aula62;

public class ExemploVarargs {

	public static void main(String[] args) {

		System.out.println("soma prt: " + soma(1, 2));
		System.out.println("soma prt: " + soma(1, 2, 3));

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("soma vetor: " + soma(arr));

		System.out.println("soma varargs: " + soma(1, 4, 52, 544, 23, 22, 3, 12));

		int arr1[] = { 1, 2, 3 };
		System.out.println("soma vetor e varargs: " + soma(arr1, 1, 2, 3));

	}

	static int soma(int a, int b) {
		return a + b;
	}

	static int soma(int a, int b, int c) {
		return a + b + c;
	}

	static int soma(int[] vetor) {
		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}

		return total;
	}

	static int soma(Integer... integers) {

		int total = 0;

		for (int i = 0; i < integers.length; i++) {
			total += integers[i];
		}
		return total;
	}

	static int soma(int[] vetor, Integer... integers) {
		int total = 0;

		for (int i = 0; i < integers.length; i++) {
			total += integers[i];
		}

		for (int j = 0; j < vetor.length; j++) {
			total += vetor[j];
		}

		return total;
	}

}
