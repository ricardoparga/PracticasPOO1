package edu.uaz.ingsoft.appcovid.universitarios.maestros;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Maestro extends Universitario{
	float sueldo;

	public Maestro(String nombre, float sueldo){
		super(nombre);
		this.sueldo = sueldo;
		if (sueldo>100 && sueldo<20000) {
			System.out.println(sueldo);
		} else {
			sueldo = 1000.00f;
			System.out.println(sueldo);
		}
	}
	public Maestro(String nombre){
		this(nombre, 1000.00f);
	}

	public boolean equals(Object o){
        boolean iguales = false;
        if (o != null && o instanceof Maestro) {
        	Maestro m = (Maestro) o;
        	if (nombre == m.nombre && sueldo == m.sueldo) {
        		iguales = true;
        	}
        }
        return iguales;
	}

	public String toString(){
		return ("Maestro: " + super.toString() + sueldo);
	}
}