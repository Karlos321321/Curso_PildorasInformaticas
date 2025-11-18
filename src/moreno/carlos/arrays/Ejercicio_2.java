package moreno.carlos.arrays;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[10];
		int suma=0;
			
		//Introducimos 10 numeros en el array
		//
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce 10 numeros --> " + (i+1));
			int numero = entrada.nextInt();
			array[i] = numero;
			
			if((i%2) == 0) suma += array[i];
		}
		

		//
		System.out.println("\nNumeros introducidos en la posiciones pares del array");
		
		for (int i = 0; i < array.length; i+=2) {
			
			System.out.println("Valor : " + array[i] + " posicion en el Array --> " + i);
		}
		
		System.out.println("\nSuma = " + suma);
		
		entrada.close();		
	}
}
