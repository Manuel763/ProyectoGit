package Carpeta;

import java.util.Calendar;

public class Fecha {
	
	Calendar cal= Calendar.getInstance();
	private int dia,mes,year;
	
	public Fecha () {
		 this.dia = cal.get(Calendar.DAY_OF_MONTH);
		 this.mes = cal.get(Calendar.MONTH);
		 this.year= cal.get(Calendar.YEAR);

	}
	
}