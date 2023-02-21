import java.util.Scanner;

import javax.swing.JOptionPane;

/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package:  
 * @author: Jose Alberto   
 * @date: 14 mar 2022 9:36:45 
 */

/** 
* @ClassName: Areas 
* @Description: TODO
* @author: Jose Alberto
* @date: 14 mar 2022 9:36:45  
*/
public class Areas {

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
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				
				System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
				
				break;
				
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El área del rectángulo es " + base*altura);
				break;
				
			case 3:
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El área del triángulo es " + (base*altura)/2);
				break;
			
			case 4:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
				System.out.print("El área del círculo es ");
				System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
				break;
				
			default:
				System.out.println("La opción no es correcta");
				break;
		}

	}

}
