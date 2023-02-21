/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 11:39:47 
 */
package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;


/** 
 * @ClassName: PruebaTemporizador3 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 11:39:47  
 */
public class PruebaTemporizador3 {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj2 mireloj = new Reloj2();
		mireloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);

	}

}

class Reloj2{
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameLaHora3 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora3();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	
}//fin de la clase Reloj
