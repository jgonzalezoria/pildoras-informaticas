/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 19:56:23 
 */
package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: TrabajandoColores 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 19:56:23  
 */
public class TrabajandoColores {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}//fin de la clase TrabajandoColores

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400, 400);
		LaminaConColor milamina = new LaminaConColor();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
	}
}//fin de la clase MarcoConColor

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//dibujo rectángulo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		
		//dibujo elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color micolor = new Color(125,189,200);
		g2.setPaint(micolor);
		g2.fill(elipse);
	}
}
