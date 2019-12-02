package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num, i = 0, result;
		
			do {
				System.out.println("Introduce un numero del 0 al 10");
				num = keyboard.nextInt();
				if(num>=0 && num<=10){
					for(i = 0; i<=10; i++) {
						result = num * i;
						System.out.println("La tabla de multiplicar del " + num + " es: " + result);
					}
				}
				
			}while(num<0 || num >10);
		}

	}
