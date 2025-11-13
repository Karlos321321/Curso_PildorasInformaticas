package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
	
		int numeroAleatorio = (int) (Math.random()*100);
		int numeroIntroducido = 0;
		int intentos = 0;
		 
		while (numeroIntroducido!=numeroAleatorio) {
			
			numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 - 100 ... "));
			intentos++;
			
			System.out.println(numeroIntroducido>numeroAleatorio ? "El numero secreto es menor !!!" : "El numero secreto es mayor !!!" );
		}
		
		System.out.println("Has necesitado " + intentos + " intentos, para hallar el numero secreto -->" + " '" + numeroAleatorio + "' ");
	}
}
