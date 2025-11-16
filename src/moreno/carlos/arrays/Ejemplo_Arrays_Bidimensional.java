package moreno.carlos.arrays;

public class Ejemplo_Arrays_Bidimensional {

	public static void main(String[] args) {
		
		int[][] numeros = new int[5][3];
		
		//Rellena la matriz con numeros aleatorios
		//
		for (int i = 0; i < numeros.length; i++) {	
			for (int j = 0; j < numeros[i].length; j++) {
				
				int numero = (int) (Math.random()*16);
				
				if(repetido(numeros, numero)) j--;
				else numeros[i][j]=numero;
			}
		}
		
		//Imprime el contenido de la Matriz Bidimensional
		//
		for (int i = 0; i < numeros.length; i++) {	
			for (int j = 0; j < numeros[i].length; j++) {
				
				System.out.printf("%2d  ", numeros[i][j]);
			}
			
			System.out.println();
		}
	}
	
	//Comprueba si el numero generado aleatoriamente esta repetido
	//
	static boolean repetido(int array[][] , int numero) {
		
		boolean salida = false;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if(numero==array[i][j]) return salida=true;
			}
		}
		
		return salida;	
	}
}
