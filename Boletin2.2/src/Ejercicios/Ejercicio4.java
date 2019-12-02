package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, sum=0;
		System.out.println("Escribe el primer numero");
		num1 = keyboard.nextInt();
		System.out.println("Escribe el segundo numero");
		num2 = keyboard.nextInt();
		
		do {
			sum = sum + num1;
			num2 = num2 -1;
			
		}while(num2 !=0);
		System.out.println("El producto es " + sum);
	}

}
//ES CON FOR