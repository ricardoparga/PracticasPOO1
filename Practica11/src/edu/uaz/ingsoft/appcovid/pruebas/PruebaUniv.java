package edu.uaz.ingsoft.appcovid.pruebas;
import static edu.uaz.ingsoft.appcovid.utils.Tablero.*;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;

public class PruebaUniv{
	public static void main(String[] args) {
		mostrar();
		insertar(new Universitario("Jose Miguel"));
		insertar(new Maestro("Giovanna",10f),4);
		insertar(new Alumno("Hanna Jimena",80));
		insertar(new Universitario("Saul alfonso"));
		insertar(new Maestro("Edwin Brayan",5000f),6);
		insertar(new Alumno("Esther Sarahi", 5));
		mostrar();
		borrar(4);
		borrar();
		borrar(10);
		mostrar();
	}
}