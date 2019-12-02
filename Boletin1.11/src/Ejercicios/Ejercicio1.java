package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in).useDelimiter("\\r\\n");
		String name, subname, street, city;
		byte age, number;
		int postal_code;
		boolean student;
		double height;

		System.out.println("Escribe los siguientes datos");
		System.out.println("Escribe un nombre: ");
		name = keyboard.next();
		System.out.println(name);
		System.out.println("Escribe tus apellidos");
		subname = keyboard.next();
		System.out.println(subname);
		System.out.println("Escribe tu edad");
		age = keyboard.nextByte();
		System.out.println(age);
		System.out.println("Escribe tu calle");
		street = keyboard.next();
		System.out.println(street);
		System.out.println("Escribe tu numero");
		number = keyboard.nextByte();
		System.out.println(number);
		System.out.println("Escribe tu código postal");
		postal_code = keyboard.nextInt();
		System.out.println(postal_code);
		System.out.println("Escribe el nombre de tu provincia");
		city = keyboard.next();
		System.out.println(city);
		System.out.println("¿Eres estudiante?");
		student=keyboard.nextBoolean();
		System.out.println(student);
		System.out.println("Escribe tu altura");
		height=keyboard.nextDouble();
		System.out.println(height);

	}

}
