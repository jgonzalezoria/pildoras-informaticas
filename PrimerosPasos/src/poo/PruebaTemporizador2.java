/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 11:14:36 
 */
package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/** 
 * @ClassName: PruebaTemporizador2 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 11:14:36  
 */
public class PruebaTemporizador2 {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj(3000, true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
	}

}

class Reloj{
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
			
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	
	
}//fin de la clase Reloj
