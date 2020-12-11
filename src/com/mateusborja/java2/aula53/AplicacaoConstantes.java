/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 53 enums e diferença de constantes
package com.mateusborja.java2.aula53;

public class AplicacaoConstantes {

	public static void main(String[] args) {

		usandoConstantes();
		usandoENUM();

	}
	

	
	private static void usandoENUM() {
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;
		System.out.println("\nUtilizando as Enum");
		
		imprimiDiaSemanaEnum(segunda);
		imprimiDiaSemanaEnum(terca);
		imprimiDiaSemanaEnum(quarta);
		imprimiDiaSemanaEnum(quinta);
		imprimiDiaSemanaEnum(sexta);
		imprimiDiaSemanaEnum(sabado);
		imprimiDiaSemanaEnum(domingo);
	}
	
	

	private static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		System.out.println("Utilizando as Constantes");

		imprimiDiaSemanaConstante(segunda);
		imprimiDiaSemanaConstante(terca);
		imprimiDiaSemanaConstante(quarta);
		imprimiDiaSemanaConstante(quinta);
		imprimiDiaSemanaConstante(sexta);
		imprimiDiaSemanaConstante(sabado);
		imprimiDiaSemanaConstante(domingo);
	}

	private static void imprimiDiaSemanaConstante(int dia) {

		switch (dia) {
		case 1:
			System.out.println("Segunda-Feira");
			break;

		case 2:
			System.out.println("Terça-Feira");
			break;

		case 3:
			System.out.println("Quarta-Feira");
			break;

		case 4:
			System.out.println("Quinta-Feira");
			break;

		case 5:
			System.out.println("Sexta-Feira");
			break;

		case 6:
			System.out.println("Sabado");
			break;

		case 7:
			System.out.println("Domingo");
			break;

		default:
			break;
		}

	}
	
	
	private static void imprimiDiaSemanaEnum(DiaSemanaEnum dia) {
		
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-Feira");
			break;
			
		case TERCA:
			System.out.println("Terça-Feira");
			break;
			
		case QUARTA:
			System.out.println("Quarta-Feira");
			break;
			
		case QUINTA:
			System.out.println("Quinta-Feira");
			break;
			
		case SEXTA:
			System.out.println("Sexta-Feira");
			break;
			
		case SABADO:
			System.out.println("Sabado");
			break;
			
		case DOMINGO:
			System.out.println("Domingo");
			break;
			
		default:
			break;
		}
		
	}
	
	
	
	

}
