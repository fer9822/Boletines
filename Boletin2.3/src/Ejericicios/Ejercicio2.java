package Ejericicios;

import java.util.Scanner;

public class Ejercicio2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int cuenta, num1, num2;
		char operator;
		System.out.println("Introduce el primer numero");
		num1 = keyboard.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = keyboard.nextInt();
		System.out.println("Introduce el operador");
		operator = keyboard.next().charAt(0);
		cuenta = cuentas(num1,num2,operator);
		System.out.println(cuenta);

	}
	public static int cuentas (int num1, int num2, char operator) {
		int resultado = 0;
		
		if(operator == '+' && num1>=num2){
			
			resultado = num1 + num2;
		}
		
		else if(operator == '-' && num1>=num2) {
			
			resultado = num1 - num2;
		}
		
		else if(operator == '*' && num1>=num2) {
			
			resultado = num1 * num2;
		}
		
		else if(operator == '/' && num1>=num2) {
			
			resultado = num1 / num2;
		}
		else {
			System.out.println("Introduce un operador válido");
		}
		return resultado;
		
	}

}
