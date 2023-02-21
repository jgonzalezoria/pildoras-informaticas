/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 18:21:50 
 */
package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: PruebaDibujo 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 18:21:50  
 */
public class PruebaDibujo {
	
	/**
	 * 
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws
	 */
	public static void main(String[] args) {
		
		MarcoConDibujos mimarco = new MarcoConDibujos();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}//fin de la clase PruebaDibujo

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("prueba de dibujo");
		setSize(400, 400);
		
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
	}
	
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		g2.draw(circulo);
		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawArc(50, 100, 100, 200, 120, 150);
	}
}