package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2;
		System.out.println("Escribe el primer número: ");
		num1 = keyboard.nextInt();
		System.out.println("Escribe el segundo número");
		num2 = keyboard.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("El número " + num1 + " es múltiplo de " + num2);
		}
		else {
			System.out.println("El número " + num1 + " no es múltiplo de " + num2);
		}
	}

}
