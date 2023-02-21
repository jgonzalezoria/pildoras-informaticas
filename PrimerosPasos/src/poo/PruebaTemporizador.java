/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 10:07:50 
 */
package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/** 
 * @ClassName: PruebaTemporizador 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 10:07:50  
 */
public class PruebaTemporizador {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		//ActionListener oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);

	}

}//fin de la clase PruebaTemporizador

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
