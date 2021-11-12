package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
public class PruebaAbstract{
	public static void main(String[] args) {
		//Universitario u1 = new Universitario("Aldo"); //No puede ser instanciado por ser abstracto.
		Maestro m1 = new Maestro("Carolina", 10000f);
		Maestro m2 = new Maestro("Jorge", 20000f);
		Alumno a1 = new Alumno("Miriam");
		Alumno a2 = new Alumno("Patrick");

		Universitario[] universitarios = {m1, m2, a1, a2};
		for (Universitario universitario : universitarios) {
			if (universitario instanceof Alumno) {
                ((Alumno)universitario).llenarCalificaciones();
                System.out.println(((Alumno)universitario).toString());
                ((Alumno)universitario).getNota();
                ((Alumno)universitario).realizarTutoria();
            } else {
                ((Maestro)universitario).getNota();
                ((Maestro)universitario).realizarTutoria();
            }
		}
	}
}