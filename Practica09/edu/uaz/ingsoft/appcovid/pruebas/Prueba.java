package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;

public class Prueba{
	public static void main(String[] args) {
		Universitario [] personas = {new Universitario("Valeria"),
			new Maestro("Federico", 5f),
			new Alumno("Hanna", 80),

			new Universitario("Valeria"),
			new Maestro("Federico", 1000f),
			new Alumno("Hanna", 5)
		};

		while (i<personas.length){
			Personaje pp = personajes[i];
			for (Personaje p : personajes) {
				if (pp == p) {
					System.out.println("*****" + pp + " es identico a " + p + " son el mismo objeto" + "*****");
				} else {
					if (pp.equals(p)) {
						System.out.println("**" + pp + " es igual a " + p + " son diferentes objetos" + "**");
					} else {
						System.out.println(pp + "!=" + p);
					}
				}
			}
			i++;
		}
	}
}