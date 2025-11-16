package moreno.carlos.flujo;

public class Ejemplo_for {

	public static void main(String[] args) {
		
		for (int i=1 ; i<10; i++) {
			
			System.out.println("Tabla de Multiplicar del " + i);
			System.out.println("==========================");
			
			for (int j = 0; j < 10; j++) {	
				
				System.out.println(i + "*" + j + " = " + i*j);
			}
			
			System.out.println();
		}
	}
}
