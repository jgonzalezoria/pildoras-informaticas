/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 14:59:26 
 */

/** 
* @ClassName: Uso_Arrays 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 14:59:26  
*/
public class Uso_Arrays {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		int [] mi_matriz2 = {5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78, 85, 65, 12, 45, 78, 78, 95, 23};
		
		for(int i = 0;i < mi_matriz2.length;i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz2[i]);
		}
		
		
	}

}
