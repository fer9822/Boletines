package Ejericicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int n = 0, m = 1;
		valor(n, m);
	}

	public static int valor(int n, int m) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escribe un numero");
		n = keyboard.nextInt();
		int i;
		for (i = 1; m < n; i++) {
			m = m + i;
		}
		System.out.println(i);
		return i;
	}

}
