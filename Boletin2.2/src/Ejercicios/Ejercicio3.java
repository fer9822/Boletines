package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		int num1, num2, num3, counter;
		System.out.println("Introduce el primer numero");
		num1 = keyboard.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = keyboard.nextInt();
		
		
		for (counter = 1; counter<=15 && num1<=num2;counter++) {
			num3 = random.nextInt(num2 - num1)+1;
			System.out.println(num3);
		}
	}

}
