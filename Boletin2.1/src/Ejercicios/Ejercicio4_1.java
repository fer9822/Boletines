package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int marks=0;
		System.out.println("Introduce tu nota del 0 al 10:");
		marks = keyboard.nextInt();
		if(marks==0 || marks==1 || marks==2) {
			System.out.println("Muy deficiente");
		}
		else if(marks == 3 || marks == 4) {
			System.out.println("Deficiente");
		}
		else if(marks == 5) {
			System.out.println("Sufiente");
		}
		else if(marks == 6) {
			System.out.println("Bien");
		}
		else if (marks == 7 || marks == 8) {
			System.out.println("Notable");
		}
		else if (marks == 9 || marks == 10) {
			System.out.println("Sobresaliente");
		}
		else {
			System.out.println("Nota no válida");
		}
	}

}
