package moreno.carlos.entradaSalida;
import java.util.Scanner;

public class RaizScannerPocasLineas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		System.out.println("La raiz es " + Math.sqrt(entrada.nextInt()));
	
	}
}
