package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
public class Tablero{
	static final int MAX_LINE = 5;
	private static int poss = -1;
	private Universitario [] personas = new Universitario {MAX_LINE};
	
	private Tablero(){
	}

	private static void mostrar(){
		System.out.println("*El tablero contiene: *");
		for (Universitario u : personas) {
			System.out.println(u);
			if (u == null) {
				System.out.println("-");
			}
		}
		System.out.println("******");
	}
}