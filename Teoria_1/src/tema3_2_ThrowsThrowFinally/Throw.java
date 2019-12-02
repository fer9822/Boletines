package tema3_2_ThrowsThrowFinally;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		
		double n;
		Scanner keyboard=new Scanner(System.in);
		
		try {
			System.out.println("Introduce un número: ");
			n=keyboard.nextDouble();
			division(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		keyboard.close();

	}
	
	public static void division(double n){
		/*float y double admiten Infinity por lo que no se lanza 
		 * una excepción cuando se divide entre cero.
		  Podemos lanzar la excepción usando throw*/
		if(n==0) {
			throw new ArithmeticException("Error: no se puede dividir entre cero");
		}
		System.out.printf("500 entre %.2f: %.2f\n",n,500/n);

	}

}
