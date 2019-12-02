/*
 * Dada una edad, que te muestre por pantalla si es mayor de edad o no.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		System.out.println("Introduce una edad:");
		age = keyboard.nextInt();
		keyboard.close();
		if(age>=18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("No eres mayor de edad");
		}
	}

}
