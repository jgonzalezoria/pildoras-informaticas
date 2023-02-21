/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 16 mar 2022 7:55:01 
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * @ClassName: Uso_Persona 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 16 mar 2022 7:55:01  
 */
public class Uso_Persona {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana López", "Biológicas");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}

	}

}//fin de la clase Uso_Persona

abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
}//fin de la clase Persona

class Empleado2 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un Id= " + id + " con un sueldo= " +  sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
}// fin de la clase Empleado2

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
}//fin de la clase Alumno