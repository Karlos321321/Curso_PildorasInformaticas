package moreno.carlos.arrays;

public class Ejemplo_Arrays {

	public static void main(String[] args) {
		
		//Arrays unidimensionales
		int[] valores = {12,23,34,45,-12,-23,45};
		
		for (int i = 0; i < valores.length; i++) {
			
			System.out.print(valores[i] + " ");
		}
		
		System.out.println();
		
		for (int i : valores) {
			
			System.out.print(i + " ");			
		}
	}
}
