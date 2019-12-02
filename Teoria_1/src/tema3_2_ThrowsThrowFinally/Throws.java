package tema3_2_ThrowsThrowFinally;

import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		
		final String FIN="fin",SIGUIENTE="siguiente";
		int number;
		String string;
		Scanner keyboard=new Scanner(System.in);
		
		try {
			System.out.print("Introduce un número o siguiente para pasar al siguiente número: ");
			string=keyboard.nextLine();
			if(!string.toLowerCase().equals(SIGUIENTE)) {
				number=convertirNumero(string);//Aquí no estamos obligados a poner un try-catch porque NumberFormatException es hija de RuntimeException
				System.out.printf("Valor del número introducido: %d\n", number);
			}
		} catch (NumberFormatException e) {
			System.out.println("Error en el número");
		}
	
		try {
			System.out.print("Introduce un número o fin para terminar: ");
			string=keyboard.nextLine();
			if(!string.toLowerCase().equals(FIN)) {
				number=convertirNumero2(string);//Aquí sí estamos obligados a poner un try-catch porque Exception no es hija de RuntimeException
				System.out.printf("Valor del número introducido: %d\n", number);
			}
		} catch (Exception e) {
			System.out.println("Error en el número");
		}
		 
		keyboard.close();

	}
	
	public static int convertirNumero(String string) throws NumberFormatException{
		
		return Integer.parseInt(string);
		
	}
	
	public static int convertirNumero2(String string) throws Exception{
		
		return Integer.parseInt(string);
		
	}	

}
