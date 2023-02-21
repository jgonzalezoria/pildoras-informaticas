/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 4 abr 2022 8:53:38 
 */
package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/** 
 * @ClassName: EventosTeclado 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 4 abr 2022 8:53:38  
 */
public class EventosTeclado {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas mimarco = new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}//fin de la clase EventosTeclado

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
	}
}//fin de la clase MarcoConTeclas

class EventoDeTeclado implements KeyListener{

	/* (non Javadoc) 
	 * @Title: keyTyped
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent) 
	 */ 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		System.out.println(letra);
	}

	/* (non Javadoc) 
	 * @Title: keyPressed
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent) 
	 */ 
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//int codigo = e.getKeyCode();
		//System.out.println(codigo);
	}

	/* (non Javadoc) 
	 * @Title: keyReleased
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent) 
	 */ 
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
