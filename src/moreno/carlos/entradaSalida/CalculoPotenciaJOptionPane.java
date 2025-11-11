package moreno.carlos.entradaSalida;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
		int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente "));
		
		double potencia = Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es de " + potencia);
		
		
				

	}

}
