/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 23:36:32 
 */
package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @ClassName: PruebaImagenes 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 23:36:32  
 */
public class PruebaImagenes {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}//fin de la clase PruebaImagenes

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen milamina = new LaminaConImagen();
		add(milamina);
	}
}//fin de la clase MarcoImagen

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		//File miimagen = new File("src/graficos/ficheros/kia-cee-d.jpg");
		try {
			imagen = ImageIO.read(new File("src/graficos/ficheros/ball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for(int i=0;i<300;i++) {
			for(int j=0;i<200;j++) {
				if(i+j>0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}
			}
		}
		
	}
	
	private Image imagen;
}
