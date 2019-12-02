package Ejercicios;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random random = new Random();
		int contador, num;
		
		for(contador = 0; contador<=20; contador++) {
			num = random.nextInt(6)+1;
			System.out.println("Dado numero " + contador + ": " + num);
			contador++;
		}
	}

}
