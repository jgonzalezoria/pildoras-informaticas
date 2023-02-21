/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 12:32:03 
 */
package graficos;

import java.awt.Frame;

import javax.swing.JFrame;

/** 
 * @ClassName: CreandoMarcos 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 12:32:03  
 */
public class CreandoMarcos {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiMarco marco1 = new MiMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame{
	
	public MiMarco() {
		//setSize(500, 300);
		
		//setLocation(500, 300);
		
		setBounds(500, 300, 550, 250);
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi Ventana");
	}
	
}