import java.util.Scanner;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 12:18:48 
 */

/** 
* @ClassName: Adivina_Numero 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 12:18:48  
*/
public class Adivina_Numero {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = (int)(Math.random()*100);
		
		int numero = 0;
		
		int intentos = 0;
		
		/*
		 * while(numero!=aleatorio) { intentos++;
		 * System.out.println("Introduce un número, por favor");
		 * 
		 * numero = entrada.nextInt();
		 * 
		 * if(aleatorio<numero) { System.out.println("Más bajo"); } else
		 * if(aleatorio>numero) { System.out.println("Más alto"); } }
		 */
		
		do{
			intentos++;
			System.out.println("Introduce un número, por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Más bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Más alto");
			}
		}while(numero!=aleatorio);
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
		
	}

}
