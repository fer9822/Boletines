package tema3_1_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

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
			System.out.println("Error en la base");
		} catch (InputMismatchException e) { 
			System.out.println("Error en el exponente");
		}
		
		keyboard.close();

	}

}
