/**   
 * Copyright © 2023 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 20 feb 2023 17:54:21 
 */

/** 
* @ClassName: Fibonacci 
* @Description: TODO
* @author: Jose Alberto
* @date: 20 feb 2023 17:54:21  
*/
public class Fibonacci {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numero = new Integer(20);
		System.out.println("El número de fibonacci iterativo que está en la posición " + numero +  " es: " + fibonacciIterativo(numero));
		System.out.println("El número de fibonacci recursivo que está en la posición " + numero +  " es: " + fibonacciRecursivo(numero));

	}
	
	public static Long fibonacciIterativo (int posicion) {
		Long resultado = new Long(0);
		Long posi = new Long (1);
		Long auxiliar;
		for(int i = 1; i <= posicion; i++) {
			resultado = posi + resultado;
			auxiliar = resultado;
			resultado = posi;
			posi = auxiliar;
		}
		return resultado;
	}
	
	public static Long fibonacciRecursivo(int posicion) {
		Long resultado;
		if(posicion == 1 || posicion == 2) {
			resultado = new Long(1);
		}
		else {
			resultado = fibonacciRecursivo(posicion-1) + fibonacciRecursivo(posicion-2);
		}
		return resultado;
	}

}
