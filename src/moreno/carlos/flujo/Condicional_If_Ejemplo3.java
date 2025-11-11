package moreno.carlos.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu distancia al colegio en km "));
		double renta_familiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu renta familiar "));
		int hermanos_centro = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero de hermanos en el centro escolar "));
		
		
		if(distancia_colegio>10 && renta_familiar<20000 && hermanos_centro>=2) System.out.println("El alumno tiene beca");
		else System.out.println("El alumno no tiene beca");
		
	}

}
