/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 20:14:51 
 */
package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

/** 
 * @ClassName: ComprobarFuente 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 20:14:51  
 */
public class ComprobarFuente {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente = false;
		
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nombreDeLaFuente: nombresDeFuentes) {
			if(nombreDeLaFuente.equals(fuente)) {
				estalafuente = true;
			}
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada");
		}
		else {
			System.out.println("No est� instalada la fuente");
		}

	}

}
