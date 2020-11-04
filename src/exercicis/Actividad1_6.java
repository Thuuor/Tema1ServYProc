package exercicis;


import java.util.Scanner;

public class Actividad1_6 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		try {
			
			int numero1 = 0;
			int numero2 = 0;
			
			System.out.println("Introduce el primer numero: ");
			numero1 = reader.nextInt();
			
			System.out.println("Introduce el Segundo numero: ");
			numero2 = reader.nextInt();
			
			int resultado = numero1 + numero2;
			
			System.out.println("El resultado es: " + resultado);
			
			
		} catch (Exception e) {
			System.err.println("Lo introducido no es un numero.");
		} finally {
			reader.close();
		}
		
		
	}

}
