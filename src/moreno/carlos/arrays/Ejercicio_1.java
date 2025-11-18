package moreno.carlos.arrays;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String positivos="";
		String negativos="";
		String ceros="";
		int numero=0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce 10 numeros --> " + (i+1));
			numero = entrada.nextInt();
			
			if(numero>1) positivos += numero + " ";
			if(numero<1) negativos += numero + " ";
			if(numero==0) ceros += numero + " ";
		}
			
			System.out.println("\nNumeros Positivos\n" + positivos);
			System.out.println("\nNumeros Negativos\n" + negativos);
			System.out.println("\nCeros introducidos\n" + ceros);
			
		entrada.close();
	}
}
