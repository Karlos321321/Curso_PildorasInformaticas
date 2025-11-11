import java.awt.Button;
import java.util.Scanner;

public class Ejemplo_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		
		Button miButton;
		
		System.out.println("Este es un boton, de la clase Button");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
	
		int edad = entrada.nextInt();
		
		System.out.println("Tu edad es " + edad);
		
		entrada.close();
		
	}
}
