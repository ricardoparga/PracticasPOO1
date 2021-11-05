package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.utils.TableroException;
public class Tablero{
	private static final int MAX = 5;
	private static int pos = -1;
	private static Universitario[] personas = new Universitario[MAX];

	private Tablero(){

	}

	public static void mostrar(){
		System.out.println("*El tablero contiene*");

		for (Universitario q : personas) {
			if (q == null) {
				System.out.println("-");
			} else {
				System.out.println(q);
			}	
		}
		System.out.println(" * * * * * ");
	}

	public static void insertar(Universitario u) throws TableroException {
		if ((pos+1 > -1) && (pos+1 < MAX) && (personas[pos+1] == null)){
			personas[pos+1] = u;
			pos++;
		} else {
			throw new TableroException("Imposible insertar en: " + (pos+1) );
		}
	}

	public static void insertar(Universitario u, int idx) throws TableroException {
		if ((idx > -1) && (idx < MAX) && (personas[idx] == null)){
			personas[idx] = u;
		} else {
			throw new TableroException("Imposible insertar en: " + idx );
		}
	}

	public static void borrar() throws TableroException {
		System.out.println(pos);
		if ((pos > -1 ) && (pos < MAX)){
		 	personas[pos] = null;
			pos--;
		 } else {
		 	throw new TableroException("Imposible borrar en: " + pos);
		 }
	}

	public static void borrar(int idx) throws TableroException {
		if ((idx > -1 ) && (idx < MAX)){
		 	personas[idx] = null;
		 } else {
		 	throw new TableroException("Imposible borrar en: " + idx);
		 }
	}

	public static Universitario[] getPersonas(){
		return personas;
	}

}
