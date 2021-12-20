package paquete;

import java.util.Scanner;

public class Proyecto9 {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		short alturasSumadas=0;
		byte nPersonas = 0;
		String nombreLargo = "";
		byte nHombres = 0;
		int diasSumados = 0;
		
		do {
			System.out.println("Introduce cuántas personas quieres registrar. (Puedes registrar entre 2 y 10)");
			nPersonas = Byte.parseByte(lector.nextLine());
		} while (nPersonas < 2 || nPersonas > 10);
		
				
			
			for(int i=0;i<nPersonas;i++) {
				System.out.println("Dime el nombre de la persona");
				String nombre = lector.nextLine();
				
				System.out.println("Ahora dime su altura en metros");
				float altura = Float.parseFloat(lector.nextLine());
				
				System.out.println("Dime su año de nacimiento");
				short anioNacimiento = Short.parseShort(lector.nextLine());
				
				short siglo = (short) ((anioNacimiento/100)+1);
				System.out.println("Has nacido en el siglo " + siglo);

				System.out.println("Eres hombre (h) o mujer (m)?");
				boolean hombre = 
						lector.nextLine().toLowerCase().charAt(0) == 'h';
				
				if (nombreLargo.length()<nombre.length()){
					nombreLargo=nombre;
				}
				
				alturasSumadas+=altura*100;
				
				if(hombre) {nHombres++;}
				
				float nDias = (2021-anioNacimiento)*365.24f;
				
				System.out.println("Has vivido aproximadamente esta cantidad de dias");
				System.out.println(nDias);
				System.out.println("Has vivido aprox " + (nDias*24)+" horas");
				diasSumados+=nDias;
				
				
				
				
				
				
				

			}
			
		
		System.out.println("El nombre mas largo es " + nombreLargo);
		System.out.println("N hombres: " + nHombres);
		System.out.println("N mujeres: " + (nPersonas-nHombres));
		System.out.println("La altura media en cm es: " + (alturasSumadas/nPersonas));
		System.out.println("El promedio de dias vividos es de " + (diasSumados/nPersonas));
	}
	
}


