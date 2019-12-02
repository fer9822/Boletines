package Ejercicios;

import java.util.Scanner;

public class Ejericicio1_for {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int n1, n2, indice;
		System.out.println("Escribe el primer numero");
		n1 = keyboard.nextInt();
		System.out.println("Escribe el segundo numero");
		n2 = keyboard.nextInt();
		int contador = 0;
		
		for (indice = n1;indice <= n2;indice+=2) {
			System.out.printf("%d\n" ,indice);
			contador++;
		}
		System.out.println("Hay " + contador + " numeros pares");
	}

}
