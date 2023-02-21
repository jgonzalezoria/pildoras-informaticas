/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 29 mar 2022 11:37:05 
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: PruebasEventos 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 29 mar 2022 11:37:05  
 */
public class PruebasEventos {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotoness mimarco = new MarcoBotoness();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoBotoness extends JFrame{
	
	public MarcoBotoness() {
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotoness milamina = new LaminaBotoness();
		
		add(milamina);
	}
	
	
}//fin de la clase MarcoBotones

class LaminaBotoness extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotoness() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			this.colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		
	}
	
}//fin de la clase LaminaBotones

