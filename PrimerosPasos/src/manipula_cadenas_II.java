/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 11 mar 2022 10:03:51 
 */

/** 
* @ClassName: manipula_cadenas_II 
* @Description: TODO
* @author: Jose Alberto
* @date: 11 mar 2022 10:03:51  
*/
public class manipula_cadenas_II {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo.... y " +
		frase.substring(29, 57);
		
		System.out.println(frase_resumen);

	}

}
