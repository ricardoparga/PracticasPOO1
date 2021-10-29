package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;

public class Prueba {
	public static void main(String[] args) {
		Universitario[] personas = {new Universitario("Valeria"), 
		new Maestro("Federico", 5f), 
		new Alumno("Hanna", 80), 
		
		new Universitario("Valeria"), 
		new Maestro("Federico",1000f), 
		new Alumno("Hanna",5)};

		int i = 0;
		while (i < personas.length){
			for (Universitario p : personas){
				if ((personas[i].equals(p)) && ((personas[i]==p))){
					System.out.println ("*****" + personas[i].getNombre() 
						+ "Es identico a " + p.getNombre() + ", Son el mismo objeto******");
					continue;
				}
				if ((personas[i].equals(p)) && (personas[i]!=p)){			
					System.out.println("**" + personas[i].toString() 
						+ "Es igual a " + p.toString() + ", Son diferentes objetos**");
					continue;
				} else {
					System.out.println(personas[i].getNombre() + "!=" + p.getNombre());			
					continue;
				}
			}
		i++;
		}
	}
}
