package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.utils.Tablero;

public class PruebaUniv{
	public static void main(String[] args) {
		Tablero.mostrar();
		Tablero.insertar(new Universitario("Jose Miguel"));
		Tablero.insertar(new Maestro("Giovanna Esmeralda ", 10f), 4);
		Tablero.insertar(new Alumno("Hanna Jimena ", 80));
		Tablero.insertar(new Universitario("Saul Alfonso"));
		Tablero.insertar(new Maestro("Edwin Brayan ", 5000f), 6);
		Tablero.insertar(new Alumno("Esther Sarahi ", 5));

		Tablero.mostrar();
		Tablero.borrar(4);
		Tablero.borrar();
		Tablero.borrar(10);
		Tablero.mostrar();
	}
}