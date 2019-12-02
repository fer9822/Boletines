/*
 * 1. char charValue()
2. static int compare(char x, char y)
3. boolean equals(Object obj)
4. static boolean isDigit(char ch)
5. static boolean isLetter(char ch)
6. static boolean isLowerCase(char ch)
7. static boolean isSpaceChar(char ch)
8. static boolean isUpperCase(char ch)
9. static char toLowerCase(char ch)
10. static char toUpperCase(char ch)
11. static Character valueOf(char c)

 */

package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		Character a='g' , x='C' , y='h';
		System.out.println(a.charValue());
		System.out.println(Character.compare(x, y));
		System.out.println(a.equals(x));
		System.out.println(Character.isDigit(x));
		System.out.println(Character.isLetter(x));
		System.out.println(Character.isLowerCase(x));
		System.out.println(Character.isSpaceChar(x));
		System.out.println(Character.isUpperCase(x));
		System.out.println(Character.toLowerCase(x));
		System.out.println(Character.toUpperCase(y));
		System.out.println(Character.valueOf(x));
	}
}
