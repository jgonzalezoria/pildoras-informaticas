import java.util.Scanner;

/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 8:45:16 
 */

/** 
* @ClassName: Entrada_ejemplo1 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 8:45:16  
*/
public class Entrada_ejemplo1 {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");

	}

}
