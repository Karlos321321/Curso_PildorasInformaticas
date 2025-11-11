package moreno.carlos.entradaSalida;
import java.util.Scanner;

public class EntradaScanner {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		System.out.println("Introduce tu nombre ");
		entrada.nextLine();
		String nombre = entrada.nextLine();
				
		System.out.println("Hola, como estas ? " + nombre + " tu edad es " + edad);
		
		entrada.close();
		
	}
}
