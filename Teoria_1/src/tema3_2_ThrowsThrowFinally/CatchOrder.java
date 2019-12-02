package tema3_2_ThrowsThrowFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchOrder {

	public static void main(String[] args) {
		
		final String FIN="fin";
		String string;
		byte number=0;
		Scanner keyboard=new Scanner(System.in);
		/*	
		try {
			System.out.print("Introduce un número de tipo byte, es decir, entre -128 y 127: ");
			number = keyboard.nextByte();
			keyboard.nextLine(); //Limpieza del buffer
			System.out.printf("Valor del número introducido: %d\n", number);
			System.out.print("Introduzca otro número de tipo byte o fin para terminar: ");
			string=keyboard.nextLine();
			if(!string.toLowerCase().equals(FIN)) {
				number=Byte.parseByte(string);
				System.out.printf("Valor del otro número introducido: %d\n", number);
			}
		} catch (Exception e) {
			System.out.println("Error: no ha introducido un número entre -128 y 127");
		} catch (InputMismatchException e) {
			System.out.println("Error");
		}
		*/
		try {
			System.out.print("Introduce un número de tipo byte, es decir, entre -128 y 127: ");
			number = keyboard.nextByte();
			keyboard.nextLine(); //Limpieza del buffer
			System.out.printf("Valor del número introducido: %d\n", number);
			System.out.print("Introduzca otro número de tipo byte o fin para terminar: ");
			string=keyboard.nextLine();
			if(!string.toLowerCase().equals(FIN)) {
				number=Byte.parseByte(string);
				System.out.printf("Valor del otro número introducido: %d\n", number);
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: no ha introducido un número entre -128 y 127");
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		keyboard.close();

	}

}
