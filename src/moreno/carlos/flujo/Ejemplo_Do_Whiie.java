package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Ejemplo_Do_Whiie {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida\n"
				+ "Para salir escribe 'Salir' ");
		
		String texto;
		
		/*while (!texto.equalsIgnoreCase("salir")) {
			
			texto = JOptionPane.showInputDialog("Introduce la frase a analizar ....");
			if(!texto.equalsIgnoreCase("salir")) System.out.println("la frase introducida es --> " + texto + ", y tiene " + texto.length() + " caracteres !!!!");	
		}*/
		
		do {	
			
			texto = JOptionPane.showInputDialog("Introduce la frase a analizar ....");
			if(!texto.equalsIgnoreCase("salir")) System.out.println("la frase introducida es --> " + texto + ", y tiene " + texto.length() + " caracteres !!!!");
			
		} while (!texto.equalsIgnoreCase("salir"));
		
		System.out.println("\nHas introducido laholaalabra 'Salir' ");
	}
}
