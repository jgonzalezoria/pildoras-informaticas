/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 4 abr 2022 13:45:54 
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/** 
 * @ClassName: PruebaAcciones 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 4 abr 2022 13:45:54  
 */
public class PruebaAcciones {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		setTitle("Prueba de acciones");
		setBounds(600, 350, 600, 300);
		
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
	
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/ficheros/bola_amarilla.png"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/ficheros/bola_azul.png"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/ficheros/bola_roja.png"), Color.RED);
		
		/*
		JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);
		*/
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		/*
		JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		*/
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaAccion.put("fondo_azul", accionAzul);
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		mapaAccion.put("fondo_rojo", accionRojo);
	}
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_de_fondo", color_boton);
		}

		/* (non Javadoc) 
		 * @Title: actionPerformed
		 * @Description: TODO
		 * @param e 
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) 
		 */ 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c = (Color)getValue("color_de_fondo");
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}//fin de la clase AccionColor
	
}


