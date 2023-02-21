/**   
 * Copyright � 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 13:19:22 
 */
package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: EscribiendoEnMarco 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 13:19:22  
 */
public class EscribiendoEnMarco {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aqu� una oraci�n describe la funci�n de este m�todo)  
	* @param  @param args archivo de configuraci�n  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Primer Texto");
		
		Lamina milamina = new Lamina();
		add(milamina);
	}
}//fin de la clase MarcoConTexto

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100 ,100);
	}
	
}//fin de la clase JPanel