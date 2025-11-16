package moreno.carlos.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad "));
		
		if (edad <18) System.out.println("No puedes pasar, tienes " + edad + " años , y eres menor de edad");
		else System.out.println("Tienes " + edad + " años, eres mayor de edad, puedes pasar");

	}
}
