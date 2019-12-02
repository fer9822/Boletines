package tema1_12_EscrituraEnPantalla.colores;
import static tema1_12_EscrituraEnPantalla.colores.Colors.*;

public class ColorsUse {

	public static void main(String[] args) {
		
		System.out.println(RED + "Este texto es de color rojo" + RESET);
		System.out.println("Volvemos al color por defecto");
		System.out.println(GREEN + "...y ahora es verde");
		System.out.println(PURPLE_BACKGROUND + "Fondo morado");
		System.out.println(CYAN + WHITE_BACKGROUND + "Fondo blanco con texto celeste");
		System.out.println(CYAN + WHITE_BACKGROUND + BOLD + "Fondo blanco con texto celeste en negrita");
		System.out.println(CYAN + WHITE_BACKGROUND + UNDERLINE + "Fondo blanco con texto celeste subrayado");
		System.out.printf("%s\n",YELLOW + RED_BACKGROUND + (char)9733);//Estrella
		System.out.println(YELLOW + GREEN_BACKGROUND + "Fondo verde con texto amarillo");
		System.out.println(YELLOW + GREEN_BACKGROUND + REVERSED + "Fondo verde con texto amarillo invertido");
		
	}
}
