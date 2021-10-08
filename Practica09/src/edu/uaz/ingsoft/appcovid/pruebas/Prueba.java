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
		int i = 0;
		while (i<personas.length){
			Universitario uu = personas[i];
			for (Universitario u : personas) {
				if (uu == u) {
					System.out.println("*****" + uu + " es identico a " + u + " son el mismo objeto" + "*****");
				} else {
					if (uu.equals(u)) {
						System.out.println("**" + uu + " es igual a " + u + " son diferentes objetos" + "**");
					} else {
						System.out.println(uu + "!=" + u);
					}
				}
			}
			i++;
		}
	}
}