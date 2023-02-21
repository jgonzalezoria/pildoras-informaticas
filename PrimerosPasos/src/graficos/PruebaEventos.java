/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 29 mar 2022 11:15:02 
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: PruebaEventos 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 29 mar 2022 11:15:02  
 */
public class PruebaEventos {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}//fin de la clase PruebaEventos

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
	}
	
	
}//fin de la clase MarcoBotones

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}
		else if(botonPulsado == botonRojo) {
			setBackground(Color.RED);
		}
		else {
			setBackground(Color.YELLOW);
		}
		
	}
	
	
}//fin de la clase LaminaBotones
