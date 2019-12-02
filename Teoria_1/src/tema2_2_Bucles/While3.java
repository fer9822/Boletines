package tema2_2_Bucles;

import java.util.Random;

public class While3 {

	public static void main(String[] args) {
		
		boolean exit=false; 
		int number;
		Random random=new Random();
		
		while(!exit){ // Condición de repetición: que exit sea false
			number=random.nextInt(500)+1;//Se calcula un número aleatorio entre 1 y 500
			System.out.println(number); 							   
			exit=(number%7==0); //exit se pone a true si el número es múltiplo de 7
		}

	}

}
