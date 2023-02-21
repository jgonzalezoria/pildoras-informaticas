/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 4 abr 2022 13:13:01 
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

/** 
 * @ClassName: FocoVentana 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 4 abr 2022 13:13:01  
 */
public class FocoVentana extends JFrame implements WindowFocusListener{

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocoVentana miv = new FocoVentana();
		miv.iniciar();
		
	}
	
	public void iniciar() {
		
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300, 100, 600, 350);
		marco2.setBounds(1200, 100, 600 , 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	/* (non Javadoc) 
	 * @Title: windowGainedFocus
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowFocusListener#windowGainedFocus(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {
			marco1.setTitle("Tengo el foco!!");
		}
		else {
			marco2.setTitle("Tengo el foco!!");
		}
	}

	/* (non Javadoc) 
	 * @Title: windowLostFocus
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowFocusListener#windowLostFocus(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {
			marco1.setTitle("");
		}
		else {
			marco2.setTitle("");
		}
	}
	
	FocoVentana marco1;
	FocoVentana marco2;

}
