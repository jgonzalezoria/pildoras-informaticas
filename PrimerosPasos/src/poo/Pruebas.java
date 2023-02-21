/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 15 mar 2022 11:11:06 
 */
package poo;

 /** 
 * @ClassName: Pruebas 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 15 mar 2022 11:11:06  
 */
public class Pruebas {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("María");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

	}

}

class Empleados{
	
	private String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " ,la sección es " + seccion + " y el ID= " + id;
	}
	
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + idSiguiente;
	}
}