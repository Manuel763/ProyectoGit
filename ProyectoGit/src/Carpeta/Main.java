package Carpeta;

import java.util.Scanner;
/**
 * Clase principal
 * @author Manuel Sarabia
 * @version 28/03/2021
 */

public class Main {
/**
 *Metodo Main
 *@param usuario Nombre y apellidos del usuario
 *@param edad Edad del usuario
 *@param fehca De la clase fecha, fecha actual
 */
	public static void main(String[] args) {
		System.out.println("Primer proyecto con GIT");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Nombre y apellidos: ");
		String usuario = sc.next();
		sc.nextLine();
		
		System.out.println("Edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		
		Fecha fecha = new Fecha ();
		
		
		System.out.println("\nUsuario: "+usuario
				+ "\nEdad: "+edad
				+fecha.toString());

	}

}
