/**   
 * Copyright © 2022 Jgonzalezoria Info. Tech Ltd. All rights reserved.
 * 
 * @Package: poo 
 * @author: Jose Alberto   
 * @date: 15 mar 2022 12:37:24 
 */
package poo;

 /** 
 * @ClassName: Furgoneta 
 * @Description: TODO
 * @author: Jose Alberto
 * @date: 15 mar 2022 12:37:24  
 */
public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		super(); // llamar al constructor de la clase padre
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacida de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
	}

}
