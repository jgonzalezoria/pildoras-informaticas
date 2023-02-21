import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 15:09:38 
 */

/** 
* @ClassName: Uso_Arrays2 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 15:09:38  
*/
public class Uso_Arrays2 {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * String [] paises = new String[8];
		 * 
		 * paises[0] = "España"; paises[1] = "México"; paises[2] = "Colombia"; paises[3]
		 * = "Perú"; paises[4] = "Chile"; paises[5] = "Argentina"; paises[6] =
		 * "Ecuador"; paises[7] = "Venezuela";
		 * 
		 * 
		 * String [] paises = {"España", "México", "Colombia", "Perú", "Chile",
		 * "Argentina", "Ecuador", "Venezuela"};
		 * 
		 * 
		 * for(int i=0;i<paises.length;i++) { System.out.println("País " + (i+1) + " " +
		 * paises[i]); }
		 * 
		 * 
		 * for(int i=0;i<8;i++) { paises[i] =
		 * JOptionPane.showInputDialog("Introduce pais " + (i+1)); }
		 * 
		 * for(String elemento: paises) { System.out.println("País: " + elemento); }
		 */
		
		int [] matriz_aleatorios = new int[150];
		
		for(int i=0;i<matriz_aleatorios.length;i++) {
			matriz_aleatorios[i] = (int)(Math.random()*100);
		}
		
		for(int numeros: matriz_aleatorios) {
			System.out.print(numeros + " ");
		}
	}

}
