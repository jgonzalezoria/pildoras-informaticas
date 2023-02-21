/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 4 abr 2022 9:52:00 
 */
package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** 
 * @ClassName: FocoEvento 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 4 abr 2022 9:52:00  
 */
public class FocoEvento {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		setVisible(true);
		setBounds(300, 300, 600, 450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel{
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
	}
	
	private class LanzaFocos implements FocusListener{

		/* (non Javadoc) 
		 * @Title: focusGained
		 * @Description: TODO
		 * @param e 
		 * @see java.awt.event.FocusListener#focusGained(java.awt.event.FocusEvent) 
		 */ 
		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		/* (non Javadoc) 
		 * @Title: focusLost
		 * @Description: TODO
		 * @param e 
		 * @see java.awt.event.FocusListener#focusLost(java.awt.event.FocusEvent) 
		 */ 
		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					comprobacion = true;
				}
			}
			if(comprobacion) {
				System.out.println("Correcto tiene @");
			}
			else {
				System.out.println("Incorrecto no tiene @");
			}
		}
		
	}//fin de la clase LanzaFocos
		
}//fin de la clase LaminaFoco


