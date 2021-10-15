package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.utils.Tablero;

public class PruebaUniv{
	public static void main(String[] args) {
		Tablero.mostrar();
		Tablero.insertar{new Universitario("Jose Miguel"),
			new Maestro(("Giovanna Esmeralda", 10f), 4),
			new Alumno("Hanna Jimena", 80),
			new Universitario("Saul Alfonso"),
			new Maestro(("Edwin Brayan", 5000f), 6)
			new Alumno("Esther Sarahi", 5)
		};
		Tablero.mostrar();
		Tablero.borrar(personas[4]);
		Tablero.borrar();
		Tablero.borrar(personas[10]);
		Tablero.mostrar();
	}
}