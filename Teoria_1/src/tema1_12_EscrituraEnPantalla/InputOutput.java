package tema1_12_EscrituraEnPantalla;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		        
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		boolean study;
		float salary;
		
		// Entrada de datos
		System.out.print("Nombre: ");
		name=keyboard.nextLine();
		System.out.print("Edad: ");
		age=keyboard.nextInt();
		System.out.print("Estudias: ");
		study=keyboard.nextBoolean();
		System.out.print("Salario: ");
		salary=keyboard.nextFloat();

		// Salida de datos
		System.out.printf("\nBienvenido: %s\n",name);
		System.out.printf("Tienes: %d años\n",age);
		System.out.printf("Estudias: %s\n",(study)?"Si":"No");
		System.out.printf("Tu salario es: %.2f euros\n",salary);
		
		keyboard.close();
		
	}
	
}
