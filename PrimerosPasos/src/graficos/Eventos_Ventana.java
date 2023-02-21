/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 29 mar 2022 11:54:44 
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/** 
 * @ClassName: Eventos_Ventana 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 29 mar 2022 11:54:44  
 */
public class Eventos_Ventana {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		mimarco.setBounds(300, 300, 500, 350);
		mimarco2.setBounds(900, 300, 500, 350);

	}

}//fin de la clase Eventos_Ventana

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		setTitle("Respondiendo");
		
		setBounds(300, 300, 500, 350);
		
		setVisible(true);
		
		M_Ventana oyente_ventana = new M_Ventana();
		
		addWindowListener(oyente_ventana);
		
	}
	
	
}//fin de la clase MarcoBotones

class M_Ventana implements WindowListener{

	/* (non Javadoc) 
	 * @Title: windowOpened
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	/* (non Javadoc) 
	 * @Title: windowClosing
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando ventana");
	}

	/* (non Javadoc) 
	 * @Title: windowClosed
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha sido cerrada");
	}

	/* (non Javadoc) 
	 * @Title: windowIconified
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana minimizada");
	}

	/* (non Javadoc) 
	 * @Title: windowDeiconified
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana restaurada");
	}

	/* (non Javadoc) 
	 * @Title: windowActivated
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activada");
	}

	/* (non Javadoc) 
	 * @Title: windowDeactivated
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent) 
	 */ 
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana desactivada");
	}
	
}
