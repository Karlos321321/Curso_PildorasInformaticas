package moreno.carlos.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Juan";
		String acceso = "";
		 
		while (!clave.equalsIgnoreCase(acceso)) {
			
			acceso = JOptionPane.showInputDialog("Introduce la clave de acceso ... ");
			
		}
		
		System.out.println("Bienvenido a la zona de usuarios !!!!");

	}

}
