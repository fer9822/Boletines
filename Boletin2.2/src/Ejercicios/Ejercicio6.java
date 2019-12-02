package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int height, line, asterisc, space;
		System.out.println("Escribe la altura de la piramide");
		height = keyboard.nextInt();

		for (line = 1; line <= height; line++) {
			for (space = 1; space <= height - line; space++) {
				System.out.print(" ");
			}
			for (asterisc = height; asterisc > height - line; asterisc--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		

		
	}
}