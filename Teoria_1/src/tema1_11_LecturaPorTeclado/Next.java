package tema1_11_LecturaPorTeclado;

import java.util.Scanner;

public class Next {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String string;
		int number;
		
		System.out.println("Introduzca pepe 1234: ");
		string=keyboard.next();
		System.out.println("Next ha cogido:");
		System.out.println(string);
		number=keyboard.nextInt();
		System.out.println("NextInt ha cogido:");
		System.out.println(number);
		
		keyboard.close();
		
	}

}
