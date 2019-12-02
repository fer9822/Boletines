package tema3_1_Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;
import static tema1_12_EscrituraEnPantalla.colores.Colors.*;


public class MethodsOfExceptions {

	public static void main(String[] args) {
		
		final String FIN="fin";
		int base,exponent;
		String baseString;
		Scanner keyboard=new Scanner(System.in);
			
		try {
			System.out.println("Bienvenido al programa para calcular una potencia.");
			System.out.print("Introduce la base o fin para terminar: ");
			baseString=keyboard.nextLine();
			if(!baseString.toLowerCase().equals(FIN)) {
				base=Integer.parseInt(baseString);
				System.out.print("Introduce el exponente: ");
				exponent = keyboard.nextInt();
				System.out.printf("%d elevado a %d es igual a %d",base,exponent,(int)Math.pow(base,exponent));
			}
		} catch (NumberFormatException e) { 
			System.out.println(GREEN+e.getMessage()+RESET);
			System.out.println(CYAN+e.toString()+RESET);
			e.printStackTrace();
		} catch (InputMismatchException e) { 
			System.out.println(GREEN+e.getMessage()+RESET);
			System.out.println(CYAN+e.toString()+RESET);
			e.printStackTrace();
		}
		
		keyboard.close();

	}

}
