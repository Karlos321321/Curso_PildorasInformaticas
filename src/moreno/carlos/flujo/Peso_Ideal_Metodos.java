package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Peso_Ideal_Metodos {
	
	static String genero = "";

	public static void main(String[] args) {
		
		int altura = altura();
		int peso = pesoIdeal(altura);
		
		impresionDatos(altura, peso);
	}
	
	static  void impresionDatos(int alt, int pesId) {
		
		String sexo = (genero.equalsIgnoreCase("h")) ? "un hombre" : "una mujer";
		System.out.println("Eres " + sexo + ", que tiene un altura de " + alt + "cm y cuyo peso ideal"
				+ "es " + pesId);
	}
	
	static int altura() {
	
		boolean salida;
		int altura=0;
	
		do {
			try {
				//salida = 'true' sale del bucle
				//salida = 'false' se repite el bucle
				salida = true;
				altura = Integer.parseInt(JOptionPane.showInputDialog("Dime tu altura en cm ?? "));
				
				if(altura<=0) {
					System.out.println("Altura incorrecta, introducela de nuevo !!!!");	
					salida=false;
				
				} 
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.fillInStackTrace() + " --> FORMATO DE DATOS INCORRECTO !!!!");
				salida = false;
			}
		} while(!salida);
		
		return altura;
	}
	
	static int pesoIdeal(int alt) {
		//salida = 'true' sale del bucle
		//salida = 'false' se repite el bucle
		boolean salida;
		int peso_Ideal=0;
		
		do {
			salida = true;
			genero = JOptionPane.showInputDialog("Hombre o Mujer h/m  ??");
			
			if(genero.equalsIgnoreCase("h")) {
				peso_Ideal = alt-110;
			} else if(genero.equalsIgnoreCase("m")) {
				peso_Ideal = alt-120;
			} else {
				System.out.println(genero + " --> Genero incorrecto, intentalo de nuevo !!!!");
				salida = false;
			}
		} while(!salida);
		
		return peso_Ideal;
	}
}
