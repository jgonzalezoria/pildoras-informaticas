import javax.swing.JOptionPane;

/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
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
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * String [] paises = new String[8];
		 * 
		 * paises[0] = "Espa�a"; paises[1] = "M�xico"; paises[2] = "Colombia"; paises[3]
		 * = "Per�"; paises[4] = "Chile"; paises[5] = "Argentina"; paises[6] =
		 * "Ecuador"; paises[7] = "Venezuela";
		 * 
		 * 
		 * String [] paises = {"Espa�a", "M�xico", "Colombia", "Per�", "Chile",
		 * "Argentina", "Ecuador", "Venezuela"};
		 * 
		 * 
		 * for(int i=0;i<paises.length;i++) { System.out.println("Pa�s " + (i+1) + " " +
		 * paises[i]); }
		 * 
		 * 
		 * for(int i=0;i<8;i++) { paises[i] =
		 * JOptionPane.showInputDialog("Introduce pais " + (i+1)); }
		 * 
		 * for(String elemento: paises) { System.out.println("Pa�s: " + elemento); }
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
