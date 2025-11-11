package moreno.carlos.entradaSalida;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Dime tu nombre ");
		
		int edad  = Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad "));
		
		
		JOptionPane.showMessageDialog(null, "Hola " + nombre + " tu edad es " + edad);
		
		
		

	}

}
