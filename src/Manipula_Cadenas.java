public class Manipula_Cadenas {
	
	public static void main(String[] args) {
		
		String frase1 = " C asa";
		String frase2 = "casa ";
		
		System.out.println(frase1.equals(frase2));
		System.out.println(frase1.trim().equalsIgnoreCase(frase2.trim()));
		
	}
}
