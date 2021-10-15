package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
public class Tablero{
	static final int MAX_LINE = 5;
	private static int poss = -1;
	private int idx;
	private static Universitario [] personas = new Universitario [MAX_LINE];

	private Tablero(){
	}

	public static void mostrar(){
		System.out.println("*El tablero contiene: *");
		for (Universitario u : personas) {
			System.out.println(u);
			if (u == null) {
				System.out.println("-");
			}
		}
		System.out.println("******");
	}
	public static void insertar(Universitario u){
		if ((poss+1 >= 0) && (poss <= MAX_LINE)) {
			personas[poss+1] = u;
			poss++;
		} else {
			System.out.println("Imposible insertar en: " + poss);
		}
	}
	public static void insertar(Universitario u, int idx){
		if ((idx >= 0) && (idx <= MAX_LINE)) {
			personas[idx] = u;
		} else {
			System.out.println("Imposible insertar en: " + idx);
		}
	}

	public static void borrar(){
		personas[poss] = null;
		poss--;
	}
	public static void borrar(int idx){
		personas[idx] = null;
	}
}