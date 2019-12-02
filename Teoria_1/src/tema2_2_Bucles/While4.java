package tema2_2_Bucles;

import java.util.Random;

public class While4 {

	public static void main(String[] args) {
		
		boolean exit=false; 
		int number,i=1;//Se inicializa i a 1
		Random random=new Random();
		
		while(!exit && i<=5){ //Mientras exit sea falsa y además i sea menor o igual a 5 
			number=random.nextInt(500)+1;
			System.out.println(number); 							   
			exit=(number%7==0);
			i++;//Se incrementa i
		}
		if(!exit) {
			System.out.println("No se encontró el múltiplo de 7");
		}
	}

}
