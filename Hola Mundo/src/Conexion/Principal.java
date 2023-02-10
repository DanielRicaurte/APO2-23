package Conexion;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Contar_Palabra());
		
	}
	
	public static String Contar_Palabra() {
		System.out.println("Bienvenido");
		System.out.println("Digite una palabra o frase");
		Scanner letra = new Scanner(System.in);
		
		String palabra = letra.next();
		
		return"La cantidad de letras que tiene la palabra es:".concat(palabra.toUpperCase());
	}
}
