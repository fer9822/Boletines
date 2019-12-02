package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Introduce el primer número");
		num1 = keyboard.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = keyboard.nextInt();
		System.out.println("Introduce el tercer número");
		num3 = keyboard.nextInt();
		
		if(num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Hay 3 números iguales");
			}
		else if(num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Hay dos números iguales");
		}
		else {
			System.out.println("No hay números iguales");
		}
		}

}
