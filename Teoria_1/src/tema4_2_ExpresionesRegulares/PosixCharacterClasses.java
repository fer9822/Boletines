package tema4_2_ExpresionesRegulares;

public class PosixCharacterClasses {

	public static void main(String[] args) {
		
		System.out.println("a".matches("\\p{Lower}"));//true
		System.out.println("A".matches("\\p{Lower}"));//false
		
		System.out.println("A".matches("\\p{Upper}"));//true
		System.out.println("a".matches("\\p{Upper}"));//false
		
		System.out.println("a".matches("\\p{Alpha}"));//true
		System.out.println("A".matches("\\p{Alpha}"));//true
		System.out.println("8".matches("\\p{Alpha}"));//false
		
		System.out.println("8".matches("\\p{Digit}"));//true	
		System.out.println("A".matches("\\p{Digit}"));//false
		
		System.out.println("A".matches("\\p{Alnum}"));//true
		System.out.println("8".matches("\\p{Alnum}"));//true
		System.out.println("a".matches("\\p{Alnum}"));//true
		System.out.println("\n".matches("\\p{Alnum}"));//false

		System.out.println("?".matches("\\p{Punct}"));//true
		System.out.println("!".matches("\\p{Punct}"));//true
		System.out.println(";".matches("\\p{Punct}"));//true
		System.out.println("a".matches("\\p{Punct}"));//false
		
		System.out.println(" ".matches("\\p{Blank}"));//true
		System.out.println("\t".matches("\\p{Blank}"));//true
		System.out.println("\n".matches("\\p{Blank}"));//false
		
		System.out.println(" ".matches("\\p{Space}"));//true
		System.out.println("\t".matches("\\p{Space}"));//true
		System.out.println("\n".matches("\\p{Space}"));//true
		System.out.println("a".matches("\\p{Space}"));//false		

	}

}
