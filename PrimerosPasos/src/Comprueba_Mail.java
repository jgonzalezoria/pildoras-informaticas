import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 13:18:25 
 */

/** 
* @ClassName: Comprueba_Mail 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 13:18:25  
*/
public class Comprueba_Mail {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.') {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}

	}

}
