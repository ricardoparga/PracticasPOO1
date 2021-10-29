package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
public class PruebaAbstract{
	public static void main(String[] args) {
		//Universitario u1 = new Universitario("Aldo"); //No puede ser instanciado por ser abstracto.
		Universitario m1 = new Maestro("Carolina", 10000f);
		Universitario m2 = new Maestro("Jorge", 20000f);
		Universitario a1 = new Alumno("Miriam");
		Universitario a2 = new Alumno("Patrick");
	}
}