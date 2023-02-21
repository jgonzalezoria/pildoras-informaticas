/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 15 mar 2022 9:28:08 
 */
package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * @ClassName: Uso_Empleado 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 15 mar 2022 9:28:08  
 */
public class Uso_Empleado {

	/**  
	* @Title: main  
	* @Description: TODO (todo) (aquí una oración describe la función de este método)  
	* @param  @param args archivo de configuración  
	* @return  void tipo de retorno  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() 
		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() 
		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() 
		+ " Fecha de Alta: " + empleado3.dameFechaContrato());
		*/
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas = (Jefatura)misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println("El Jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de " +
		jefa_Finanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de : " + misEmpleados[3].estableceBonus(200));
		
		/*
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		*/
		
		System.out.println(jefa_Finanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		/*
		for(int i=0;i<3;i++) {
			System.out.println("Nombre :" + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() 
			+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
		*/
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre :" + e.dameNombre() + " Sueldo: " + e.dameSueldo() 
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}

	}// fin del main

}// fin de la clase Uso_Empleado

class Empleado implements Comparable, Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonus_base + gratificacion;
	}
	
	public String dameNombre() {
		return nombre + " Id: " + id;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	
}// fin de la clase Empleado

class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	
}// fin de la clase Jefatura
