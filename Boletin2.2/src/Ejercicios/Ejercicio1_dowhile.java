package Ejercicios;

import java.util.Scanner;

public class Ejercicio1_dowhile {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int n1, n2;
		System.out.println("Escribe el primer numero");
		n1 = keyboard.nextInt();
		System.out.println("Escribe el segundo numero");
		n2 = keyboard.nextInt();
		int indice = n1;
		int contador = 0;
		
		do {
			if (indice % 2 == 0) {
				System.out.printf("%d\n" ,indice);
				indice +=2;
				contador++;
			}
			else {
				indice++;
		
			}
		
		}while(indice <= n2);
		System.out.println("Hay " + contador + " numeros pares");			

	}
	
}