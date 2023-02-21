/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 29 mar 2022 13:02:38 
 */
package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

/** 
 * @ClassName: CambioEstado 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 29 mar 2022 13:02:38  
 */
public class CambioEstado {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		setVisible(true);
		setBounds(300, 300, 500, 350);
		
		CambiaEstado nuevo_estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
	}
}

class CambiaEstado implements WindowStateListener{

	/* (non Javadoc) 
	 * @Title: windowStateChanged
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowStateListener#windowStateChanged(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa");
		}
		else if(e.getNewState()==Frame.NORMAL){
			System.out.println("La ventana está normal");
		}
		else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana está minimizada");
		}
	}
	
}
