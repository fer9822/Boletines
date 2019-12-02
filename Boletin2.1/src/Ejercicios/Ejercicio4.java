/*
 * Dada una nota, que te muestre lo siguiente: (hacerlo con anidación y con switch)
0, 1, 2: Muy deficiente
3, 4: Insuficiente
5: Suficiente
6: Bien
7, 8: Notable
9, 10: Sobresaliente
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int marks=0;
		System.out.println("Introduce tu nota del 0 al 10:");
		marks = keyboard.nextInt();
		switch(marks) {
			case 0: case 1: case 2:
				System.out.println("Muy deficiente");
				break;
			case 3: case 4:
				System.out.println("Deficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7: case 8:
				System.out.println("Notable");
				break;
			case 9: case 10:
				System.out.println("Sobresaliente");
				break;
				
		}
	}

}
