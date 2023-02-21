/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 14 mar 2022 19:09:55 
 */
package poo;

import javax.swing.JOptionPane;

/** 
 * @ClassName: Uso_Vehiculo 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 14 mar 2022 19:09:55  
 */
public class Uso_Vehiculo {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + ". " + micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales() + ". " + mifurgoneta1.dimeDatosFurgoneta());

	}

}
