/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: graficos 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 12:52:47 
 */
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/** 
 * @ClassName: CreandoMarcoCentrado 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 12:52:47  
 */
public class CreandoMarcoCentrado {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco Centrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/ficheros/kisspng-computer-icons-user.jpg");
		
		setIconImage(miIcono);
	}
	
}
