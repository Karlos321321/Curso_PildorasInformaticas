package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para hallar su factorial -->"));
		int factorial=numero;
		
		for (int i = (numero-1); i>0; i--) {
			
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}
