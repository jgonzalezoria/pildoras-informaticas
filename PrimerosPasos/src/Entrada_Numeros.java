import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 9:00:43 
 */

/** 
* @ClassName: Entrada_Numeros 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 9:00:43  
*/
public class Entrada_Numeros {
	
	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
