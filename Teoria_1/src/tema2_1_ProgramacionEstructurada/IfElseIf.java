package tema2_1_ProgramacionEstructurada;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print("Introduce tu edad: ");
		age=keyboard.nextInt();
		keyboard.close();
		
		if(age>=18) {
			System.out.println("Eres mayor de edad");
		}
		else if(age<18 && age>=16) {
			System.out.println("Eres menor de edad pero tienes ciertos privilegios");
		}
		else if(age<16 && age>=14) {
			System.out.println("Eres menor de edad y además no tienes privilegios");
		}
		else {
			System.out.println("Eres menor de edad");
		}

	}

}
