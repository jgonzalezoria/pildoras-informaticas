/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 20:21:48 
 */
package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: TrabajandoConFuentes 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 20:21:48  
 */
public class TrabajandoConFuentes {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}//fin de la clase TrabajandoConFuentes

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		setTitle("Prueba con fuentes");
		setSize(400, 400);
		LaminaConFuentes milamina = new LaminaConFuentes();
		add(milamina);
		milamina.setForeground(Color.BLUE);
	}
}//fin de la clase MarcoConFuentes

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(mifuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("Jose", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 24));
		//g2.setColor(new Color(128, 90, 50).brighter());
		g2.drawString("Curso de Java", 100, 200);
		
	}
	
}
