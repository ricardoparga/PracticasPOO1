package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
public class Tablero{
	static final int MAX_LINE = 5;
	private static int poss = -1;
	private int idx;
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
	private static void insertar(Universitario u){
		if ((poss+1 >= 0) && (poss <= MAX_LINE)) {
			u = personas[poss+1];
			poss++;
		} else {
			System.out.println("Error");
		}
	}
	private static void insertar(Universitario u, int idx){
		if ((idx >= 0) && (idx <= MAX_LINE)) {
			u = personas[idx];
		} else {
			System.out.println("Error");
		}
	}
	
}