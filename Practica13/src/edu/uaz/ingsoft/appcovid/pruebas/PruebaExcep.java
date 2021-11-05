package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.utils.Tablero;
import edu.uaz.ingsoft.appcovid.utils.TableroException;
public class PruebaExcep{
	public static void main(String[] args) {
		try {
			Tablero.insertar(new Maestro("Cristian", 10000f));
			Tablero.insertar(new Maestro("Jorge", 100000f));
			Tablero.insertar(new Alumno("Valeria"));
			Tablero.insertar(new Maestro("Federico", 5f));
			Tablero.insertar(new Alumno("Hanna"));
			Tablero.insertar(new Alumno("Miriam"));
		} catch (TableroException e){
			System.out.println(e);
		}
		Tablero.mostrar();
		
	}
}