package moreno.carlos.flujo;
import javax.swing.JOptionPane;

public class Email_Valido {

	public static void main(String[] args) {
		
		boolean salida = false;
		String mail="";
		
		while (!salida) {
			
			int arroba=0;
			int punto=0;
			mail = JOptionPane.showInputDialog("Introduce una direccion de e-mail ...");
			
			for (int i = 0; i < mail.length(); i++) {
				
				if (mail.charAt(i)=='@') arroba++;
				if (mail.charAt(i)=='.') punto++;
			}
			
			if(arroba==1 && punto==1 && mail.length()>=4) salida=true;
			else System.out.println("Email incorrecto !!!!");
		}
		
		System.out.println(" Direccion de Email correcta !!!!!  ---  " + mail);
	}
}
