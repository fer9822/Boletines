package Ejericicios;

import java.util.Scanner;

public class Ejercicio5 {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num1, num2;
		
		
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Introduzca el dividendo");
			num1 = keyboard.nextInt();
			System.out.println("Introduce el divisor");
			num2 = keyboard.nextInt();
		} while (num1>num2);
		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + MCD(num1,num2));
		
		

	}

	public static int MCD(int dividend,int divisor)
	{
	    int Rest;
	    
	    Rest = dividend  %  divisor;
	    do
	        {
	            dividend = divisor;
	            divisor = Rest;
	            Rest = dividend  %  divisor;
	        }
	    while (Rest!= 0);
	 
	    
	return divisor;
	 
	}
}