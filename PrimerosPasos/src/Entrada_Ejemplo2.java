import javax.swing.JOptionPane;

/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 8:51:18 
 */

/** 
* @ClassName: Entrada_Ejemplo2 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 8:51:18  
*/
public class Entrada_Ejemplo2 {
	
	/**
	 * 
	* @Title: main  
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws
	 */
	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario = Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + edad_usuario + " a�os");
		
	}

}
