package tema2_3_Funciones;

import java.util.Scanner;
import static tema1_12_EscrituraEnPantalla.colores.Colors.*;

public class Procedure {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		String string;
		
		System.out.print("Introduce una cadena: ");
		string=keyboard.nextLine();
		pintarVerde(string);
		
		keyboard.close();		

	}
	public static void pintarVerde(String string) {
		
		System.out.printf("La cadena que has introducido en verde: %s",GREEN+string+RESET);
		
	}
}
