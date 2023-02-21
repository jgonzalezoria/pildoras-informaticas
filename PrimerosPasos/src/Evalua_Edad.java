import java.util.Scanner;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 9:26:14 
 */

/** 
* @ClassName: Evalua_Edad
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 14 mar 2022 9:26:14
 */
public class Evalua_Edad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad, por favor");

		int edad = entrada.nextInt();

		if(edad<18) {
			System.out.println("Eres un adolescente");
		}
		else if(edad<40) {
			System.out.println("Eres joven");
		}
		else if(edad<65) {
			System.out.println("Eres maduro");
		}
		else {
			System.out.println("Cuídate");
		}

	}

}
