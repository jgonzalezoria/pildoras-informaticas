import javax.swing.JOptionPane;

/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 13:29:31 
 */

/** 
* @ClassName: Factorial 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 13:29:31  
*/
public class Factorial {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
		
		for(int i=numero;i>0;i--) {
			resultado *=i;
		}
		
		System.out.println("El factorial de " +  numero + " es " + resultado);

	}

}
