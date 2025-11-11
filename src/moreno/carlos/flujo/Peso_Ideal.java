package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Peso_Ideal {
	
	public static void main(String[] args) {
		
		boolean salida;
		
		do {
			try {
				
				salida = true;
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Dime tu altura en cm ?? "));
				String genero = JOptionPane.showInputDialog("Hombre o Mujer h/m  ??");
				
				if(genero.equalsIgnoreCase("h")) System.out.println("Eres un hombre y tu peso ideal es " + (altura-110));
					else if(genero.equalsIgnoreCase("m")) System.out.println("Eres una mujer y tu peso ideal es " + (altura-120));
						else {
							System.out.println("Genero incorrecto, intentalo de nuevo !!!!");
							salida = false;
							}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("!!!! Error en el formato de los DATOS !!!!");
				salida = false;
			}
			
		} while(!salida);
	}
}
