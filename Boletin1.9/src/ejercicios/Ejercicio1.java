/*
 * 1. static float abs(float a)
2. static int addExact(int x, int y)
3. static double ceil (double a). Probar con positivo y negativo.
4. static int decrementExact (int a)
5. static double floor(double a). Probar con positivo y negativo.
6. static int incrementExact(int a)
7. static double max(double a, double b)
8. static int multiplyExact(int x, int y)
9. static int negateExact (int a)
 */
package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		float a = 5;
		double b = 6, c = 9;
		int x = 3, y = 4, i = 8;
		System.out.println("1) " + (Math.abs(a)));
		System.out.println("2) " + (Math.addExact(x, y)));
		System.out.println("3) " + (Math.ceil(a)));
		System.out.println("4) " + (Math.decrementExact(i)));
		System.out.println("5) " + (Math.floor(b)));
		System.out.println("6) " + (Math.incrementExact(x)));
		System.out.println("7) " + (Math.max(c, b)));
		System.out.println("8) " + (Math.multiplyExact(x, y)));
		System.out.println("9) " + (Math.negateExact(x)));
	}

}
