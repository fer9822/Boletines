package tema1_11_LecturaPorTeclado;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		        
		Scanner keyboard = new Scanner(System.in);
		String string;
		int i;
		float f;
		boolean b;
		
		string=keyboard.nextLine();
		System.out.println(string);
		i=keyboard.nextInt();
		System.out.println(i);
		b=keyboard.nextBoolean();
		System.out.println(b);
		f=keyboard.nextFloat();//Introducir los decimales con coma, no con punto
		System.out.println(f);
		
		keyboard.close();
		
	}
	
}
