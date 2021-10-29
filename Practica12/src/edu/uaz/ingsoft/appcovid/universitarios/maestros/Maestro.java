package edu.uaz.ingsoft.appcovid.universitarios.maestros;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Maestro extends Universitario implements Tutorias{
	private float sueldo;

	public Maestro(String nombre, float sueldo){
		super(nombre);
		if ((sueldo > 100.00f) && (sueldo < 20001.00f)){
			this.sueldo = sueldo;
		} else {
			sueldo = 1000.00f;
		}
	}

	public Maestro(String nombre){
		this(nombre, 1000.00f);
	}

	public void realizarTutoria(){
		System.out.println("Imparte tutoria");
	}
	public void getNota(){
		System.out.println("El docente imparte las notas a los alumnos.");
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Maestro)){
			Maestro m = (Maestro) o;
			if ( (this.getNombre().equals(m.getNombre())) && (this.sueldo == m.sueldo)){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int suel = (int) (sueldo);
		return super.hashCode()*suel;
	}

	public String toString(){
		return ("Maestro: " + super.toString() + "\t" + sueldo);
	}

	public String getNombre(){
		return super.getNombre();
	}

}