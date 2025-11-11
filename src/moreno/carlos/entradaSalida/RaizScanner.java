package moreno.carlos.entradaSalida;

import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un numero, para calcular su raiz cuadrada ");
		int numero = entrada.nextInt();
		
		double raiz = Math.sqrt(numero);
		
		System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
		entrada.close();
	}
}
