package moreno.carlos.entradaSalida;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPanePOCAS_LINEAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("El resultado es de " + Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero ")), 
															Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente "))));

	}
}
