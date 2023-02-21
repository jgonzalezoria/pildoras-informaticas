import java.util.Scanner;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 16 mar 2022 8:35:48 
 */

/** 
* @ClassName: Uso_Tallas 
* @Description: TODO
* @author: Jose Alberto
* @date: 16 mar 2022 8:35:48  
*/
public class Uso_Tallas {
	
	//enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private String abreviatura;

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}

	}

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla= " + la_talla);
		
		System.out.println("Abreviatura= " + la_talla.dameAbreviatura());

	}

}
