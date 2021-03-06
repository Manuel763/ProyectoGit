package Carpeta;

import java.util.Calendar;

/**
 * Clase Fecha para generar fecha actual
 * @author Manuel Sarabia
 * @version 28/03/2021
 */

public class Fecha {
	
	/**
	 * @param dia Dia actual
	 * @param mes Mes actual
	 * @param year A?o actual
	 */
	
	Calendar cal= Calendar.getInstance();
	private int dia,mes,year;
	
	/**
	 * Constructor 
	 * @return Fecha actual 
	 */
	
	public Fecha () {
		 this.dia = cal.get(Calendar.DAY_OF_MONTH);
		 this.mes = cal.get(Calendar.MONTH);
		 this.year= cal.get(Calendar.YEAR);

	}
	
	public String toString () {
		return "Fecha: "+ dia+"/"+mes+"/"+year;
	}
	
}
