package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Introduce un número:");
		number = keyboard.nextInt();
		if(number == 0) {
			System.out.println("El número es 0");
		}
		else if(number > 0) {
			System.out.println("El número es positivo");
		}
		else if (number < 0) {
			System.out.println("El número es negativo");
		}
	}

}
