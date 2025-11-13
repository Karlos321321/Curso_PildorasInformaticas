package moreno.carlos.flujo;

import java.util.Scanner;

public class Condicional_switch_Novedad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana ... ");
		String diaSemama = entrada.nextLine();
		
		String resultado = switch (diaSemama) {
		
			case "lunes","martes","miercoles","jueves","viernes" -> "laborable";
			
			case "sabado","domingo" -> "festivo";	
			
			default -> {
			
				System.out.println("Procesando la informacion introducida.....");
				System.out.println("Switch  terminado, no se encontró dia de la semana");
				
				yield  "Dia no valido";
			}
		};
		
		System.out.println(resultado);
	}
}