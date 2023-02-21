import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 12:52:15 
 */

/** 
* @ClassName: Peso_Ideal 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 12:52:15  
*/
public class Peso_Ideal {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género(H/M)");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
		
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}
		else if(genero.equalsIgnoreCase("M")){
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + pesoIdeal + "Kg");

	}

}
