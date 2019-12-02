/*
 * Dado un número, indicar si es par o impar.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Introduce un número");
		number = keyboard.nextInt();
		keyboard.close();
		if(number%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}

}
