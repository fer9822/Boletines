package tema3_1_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Resumption {

	public static void main(String[] args) {
		
		byte number=0;
		Scanner keyboard=new Scanner(System.in);
		boolean error=false;
			
		do {
			try {
				System.out.print("Introduce un número de tipo byte, es decir, entre -128 y 127: ");
				number = keyboard.nextByte();
				System.out.printf("Valor del número: %d\n", number);
				error=false; //Si se ha entrado antes en el catch, error está a true
			} catch (InputMismatchException e) {
				System.out.println("Error");
				error=true;
				keyboard.nextLine(); //Limpieza del buffer
			} 
		} while (error);
		
		keyboard.close();

	}

}
