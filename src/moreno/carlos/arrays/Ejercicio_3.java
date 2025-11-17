package moreno.carlos.arrays;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		int posicion=0;
		String repetidos="";
		
		//Introducimos 100 numeros de forma aleatoria en el array
		//
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*5);
		}
		
		//Imprimimos el array con un bucle foreach
		//
		for (int i : array) {
			
			System.out.printf("Posicion: %2d ---> Valor: %2d\n", posicion , i);
			posicion++;
		}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 1; j < array.length; j++) {
				
				if(array[i] == array[j]) {
					
					repetidos += array[i];
				}
			}
		}
		
		System.out.println(repetidos);
	}
}
