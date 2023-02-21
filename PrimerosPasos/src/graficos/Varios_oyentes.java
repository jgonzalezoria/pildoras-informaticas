/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 5 abr 2022 10:15:06 
 */
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: Varios_oyentes 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 5 abr 2022 10:15:06  
 */
public class Varios_oyentes {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		setTitle("Prueba varios");
		setBounds(1300, 100, 300, 200);
		
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
	
}

class Lamina_Principal extends JPanel{
	
	JButton boton_cerrar;
	
	public Lamina_Principal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
		
	}
	
	private class OyenteNuevo implements ActionListener{

		/* (non Javadoc) 
		 * @Title: actionPerformed
		 * @Description: TODO
		 * @param e 
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) 
		 */ 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
			
		}
		
	}
	
}

class Marco_Emergente extends JFrame{
	
	private static int contador = 0;
	
	public Marco_Emergente(JButton boton_de_principal) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodos implements ActionListener{

		/* (non Javadoc) 
		 * @Title: actionPerformed
		 * @Description: TODO
		 * @param e 
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent) 
		 */ 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			contador = 0;
		}
		
	}
	
	
}