package code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput miConsoleInput= new ConsoleInput(keyboard);
		char c;
		
		c = miConsoleInput.readchar();
		System.out.println(c);
		
	}

}
