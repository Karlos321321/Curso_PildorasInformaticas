package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Peso_Ideal {
	
	public static void main(String[] args) {
		
		boolean salida;;
		boolean salida2;
		int altura=0;
		String genero="";
		
		do {
			try {
				//salida = 'true' para que el programa termine
				//salida = 'false' para que el programa se repita
				salida = true;
				altura = Integer.parseInt(JOptionPane.showInputDialog("Dime tu altura en cm ?? "));
				
				if(altura<=0) {
					System.out.println("Altura incorrecta, introducela de nuevo !!!!");	
					salida=false;
				
				} else {
					
					do {
							salida2 = true;	
							genero = JOptionPane.showInputDialog("Hombre o Mujer h/m  ??");
							
							if(genero.equalsIgnoreCase("h")) {
								System.out.println("Eres un hombre y tu peso ideal es " + (altura-110));
								} else if(genero.equalsIgnoreCase("m")) {
									System.out.println("Eres una mujer y tu peso ideal es " + (altura-120));
									} else {
										System.out.println(genero + " --> Genero incorrecto, intentalo de nuevo !!!!");
										salida2 = false;
										}
					
					} while(!salida2);
						
					}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.fillInStackTrace() + " --> FORMATO DE DATOS INCORRECTO !!!!");
				salida = false;
			}
			
		} while(!salida);
	}
}
