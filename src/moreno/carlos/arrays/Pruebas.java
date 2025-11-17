package moreno.carlos.arrays;

public class Pruebas {

	public static void main(String[] args) {
		
		
		
		for (int i = 0; i < 100; i++) {
			
			if (i%2!=0) continue;
			
			System.out.println("Posicion " + i + "  Valor: " + (int)(Math.random()*100));
			
		}
	}
}
