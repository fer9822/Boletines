/*
 * Dada una cantidad, si es mayor de 1000, que muestre el 15% de dicha cantidad. Si no, que no
haga nada.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int quantity;
		System.out.println("Introduce una cantidad:");
		quantity = keyboard.nextInt();
		keyboard.close();
		if(quantity>1000) {
			int discount = (15 * quantity)/100;
			System.out.println("Este es tu descuento:" + discount);
		}
		else {
			System.out.println("No te hacemos descuento si no es mayor de 1000");
		}
	}

}
