package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad "));
		
		if (edad<18) System.out.println("Eres muy joven");
			else if (edad<30) System.out.println("Eres Jovencito");
				else if (edad<60) System.out.println("Eres maduro");
					else if (edad>80) System.out.println("Eres un abuelo");

	}
}
