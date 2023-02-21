/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 16:28:28 
 */

/** 
* @ClassName: Ejemplo_Array_2D 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 16:28:28  
*/
public class Ejemplo_Array_2D {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes = 0.10;
		
		double[][] saldo = new double[6][5];
		
		for(int i = 0;i<6;i++) {
			saldo[i][0] = 10000;
			acumulado = 10000;
			for(int j=1;j<5;j++) {
				acumulado = acumulado+(acumulado*interes);
				saldo[i][j]= acumulado;
			}
			interes = interes + 0.01;
		}
		
		for(int i=0;i<6;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.printf("%1.2f", saldo[i][j]);
				System.out.print(" ");
			}
		}

	}

}
