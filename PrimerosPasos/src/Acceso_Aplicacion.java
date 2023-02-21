import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 12:10:04 
 */

/** 
* @ClassName: Acceso_Aplicacion 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 12:10:04  
*/
public class Acceso_Aplicacion {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Jose";
		
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if(clave.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
