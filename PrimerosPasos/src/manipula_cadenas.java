/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 9 mar 2022 11:10:06 
 */

/** 
* @ClassName: manipula_cadenas 
* @Description: TODO
* @author: Jose Alberto
* @date: 9 mar 2022 11:10:06  
*/
public class manipula_cadenas {
	
	public static void main(String[] args) {
		
		String nombre = "Felipe Juan Froilan de todos los santos";
		
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene " +nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra = nombre.length();
		
		System.out.println("Y la última letra es la " + nombre.charAt(ultima_letra-1));
	}

}
