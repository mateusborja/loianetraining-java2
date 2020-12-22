/*
 * Copyright (c) 2020.  | All rights reserved
 * @author Mateus Borja // UX Designer • 3D Artist • Developer
 * at www.mateusborja.life
 */
//aula 65 annotations - metadados
package com.mateusborja.java2.aula65;

@interface AnnotationAula {
	
	String autor();
	
	String aula();
	
	String blog() default "https://www.mateusborja.life";
	
	String site()default "https://www.mateusborja.life";

}
