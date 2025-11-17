package moreno.carlos.arrays;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce 10 numeros --> " + (i+1));
			int numero = entrada.nextInt();
			array[i] = numero;
	
		}
		
		for (int i : array) {
			
			System.out.print(i + " ");			
		}
	}
}
