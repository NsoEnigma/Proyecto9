package paquete;

import java.util.Scanner;

public class Proyecto9 {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		float alturasSumadas=0;
		byte nPersonas = 0;
		String nombreLargo = "i";
		byte nHombres = 0;
		byte nMujeres = 0;
		char genero = 0;
		int horasSumadas = 0;
		
		do {
			System.out.println("Introduce cuántas personas quieres registrar. (Puedes registrar entre 2 y 10)");
			nPersonas = Byte.parseByte(lector.nextLine());
		} while (nPersonas < 2 || nPersonas > 10);
		
				
		if (nPersonas >=2 || nPersonas <=10 ) {
			
			for(int i=0;i<nPersonas;i++) {
				System.out.println("Dime el nombre de la persona");
				String nombre = lector.nextLine();
				if (nombre.length()>nombreLargo.length()){
	                nombreLargo=nombre;
	            }
				
				do {
					System.out.println("Ahora dime su genero (h/m)");
					genero = lector.nextLine().charAt(0);
					if (genero == 'h') {
						nHombres += 1;
					}
					
					if (genero == 'm') {
						nMujeres += 1;
					}
					
				} while (genero != 'h' && genero != 'm');
				
				System.out.println("Ahora dime su altura en metros");
				float altura = Float.parseFloat(lector.nextLine());
				alturasSumadas+=altura;
				
				System.out.println("Dime su año de nacimiento");
				short anioNacimiento = Short.parseShort(lector.nextLine());
				System.out.println("Esta persona nacio en el siglo: " + ((anioNacimiento/100)+1));
				int edad = (2021-anioNacimiento);
				int dias = ((2021 - anioNacimiento) * 365);
				int horas = (edad * 365)*24;
				System.out.println("Tambien podemos decir que ha vivido un total de " +edad+ " años por lo cual a vivido " + dias + " dias y un total de " + horas + " horas." );
				horasSumadas += horas;
				
				

			}
			
		}
		System.out.println("La altura media seria de " + (alturasSumadas/nPersonas)*100 + " centímetros.");
		System.out.println("El nombre mas largo es " + nombreLargo);
		System.out.println("Hay un total de " + nHombres + " hombres y de " + nMujeres + " mujeres.");
		System.out.println("Las horas promedias vividas es de " + horasSumadas + " horas.");
	}
	
}


