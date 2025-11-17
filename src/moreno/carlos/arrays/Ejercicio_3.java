package moreno.carlos.arrays;
import java.util.Arrays;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		int posicion=0;
		
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random()*10);
		}
		
		System.out.println("Contenido total del array");
		System.out.println("=========================\n");
		
		for (int i : array) {
			
			System.out.printf("Posicion: %2d ---> Valor: %2d\n", posicion , i);
			posicion++;
		}
		
		System.out.println();
		
		//EMPIEZA EL PROGRAMA DE VERDAD !!!!
		//	
	    boolean[] visited = new boolean[array.length];
	    
	    Arrays.fill(visited, false);

	    for (int i = 0; i < array.length; i++) {
	    	
	    	String posicionRepetido="";

	    	if (visited[i]) continue;
	        
	        int count = 1;
	        
	        for (int j = i + 1; j < array.length; j++) {
	         
	        	if (array[i] == array[j]) {
	        		count++;
	                visited[j] = true;
	                posicionRepetido += String.valueOf(j) + " " ;
	                
	        	}
	        }
	        
	        System.out.println("El número " + array[i] + (count>1 ? " se repite " + count + " veces.": " no se repite"));
	        System.out.println(count==1 ? "POSICION INICIAL " + i : "en las posiciones: " + i + " " + posicionRepetido);
	        System.out.println();
	    }
	}
}
