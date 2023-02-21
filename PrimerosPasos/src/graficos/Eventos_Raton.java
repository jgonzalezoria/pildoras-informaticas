/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 4 abr 2022 9:17:23 
 */
package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

/** 
 * @ClassName: Eventos_Raton 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 4 abr 2022 9:17:23  
 */
public class Eventos_Raton {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventosDeRaton eventoRaton = new EventosDeRaton();
			addMouseListener(eventoRaton);
			addMouseMotionListener(eventoRaton);
	}
}

class EventosDeRaton implements MouseListener, MouseMotionListener{

	/* (non Javadoc) 
	 * @Title: mouseClicked
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Coordenada X: " + e.getX() +  ", Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount());
	}

	/* (non Javadoc) 
	 * @Title: mousePressed
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has presionado el botón izquierdo");
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has presionado la rueda del ratón");
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has presionado el botón derecho");
		}
	}

	/* (non Javadoc) 
	 * @Title: mouseReleased
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}

	/* (non Javadoc) 
	 * @Title: mouseEntered
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	/* (non Javadoc) 
	 * @Title: mouseExited
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}

	/* (non Javadoc) 
	 * @Title: mouseDragged
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("EStás arrastrando");
	}

	/* (non Javadoc) 
	 * @Title: mouseMoved
	 * @Description: TODO
	 * @param e 
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent) 
	 */ 
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo");
	}
	
}