package moreno.carlos.flujo;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario "));
		//double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo salario "));
				
		String mayor = (edad>18) ? "Eres mayor de edad" : "Eres menor de edad";
		
		System.out.println(mayor);
		
		
	}
}
