package tema2_1_ProgramacionEstructurada;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int weekday;
		
		System.out.print("Introduce un número del 1 al 7 correspondiente al día de la semana: ");
		weekday=keyboard.nextInt();
		keyboard.close();
		
		switch(weekday) {
			case 1:	
				System.out.println("Lunes");
			 	break;
			case 2:	
				System.out.println("Martes");
				break;
			case 3:	
				System.out.println("Miércoles");
				break;
			case 4:	
				System.out.println("Jueves");
				break;
			case 5:	
				System.out.println("Viernes");
				break;
			case 6:	
				System.out.println("Sábado");
				break;
			case 7:	
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Día incorrecto"); 
				break;
		}

	}

}
