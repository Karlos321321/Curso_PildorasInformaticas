package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad "));
		
		if(edad>=18) {	
			String carnet = JOptionPane.showInputDialog("Tienes carnet de conducir??");
			
			if(carnet.equalsIgnoreCase("si")) JOptionPane.showMessageDialog(null, "Eres mayor de edad y tienes carnet de conducir, por lo tanto puedes comprarte el coche");
				else JOptionPane.showMessageDialog(null, "Eres mayor de edad pero no tienes carnet de conducir");
			
		} else JOptionPane.showMessageDialog(null, "Eres menor de edad, por lo que no puedes tener carnet de conducir ni comprarte un coche"); 
	}
}
