package tema4_1_Cadenas;

public class StringClass2 {

	public static void main(String[] args) {
		
		int i=100;
		String string1,string2,string3,string4;
		
		string1="Esto es un literal cadena";  //Se le da un valor inicial a la cadena con el operador de asignación =
		System.out.println(string1);
		System.out.println(string1 + " al cual le hemos concatenado este literal cadena"); //Se concatena otra cadena con el operador +
		
		string2="hola";
		string3=" que tal";
		string4=string2+string3;
		System.out.println(string4);

		System.out.println(i+100);  //Suma de enteros
		System.out.println(String.valueOf(i)+100); //Concatenación de cadenas
	}

}
