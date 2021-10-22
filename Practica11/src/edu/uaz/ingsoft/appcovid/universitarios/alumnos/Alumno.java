package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Alumno extends Universitario{
	public int Calificacion[] calificaciones = new Calificacion[4];
	private float promedio = 0.0f;

	public Alumno(String nombre){
		this(nombre);
		promedio = (Calificacion[0] + Calificacion[1] + Calificacion[2]
					Calificacion[3] + Calificacion[4]);
	}
	public void setCalificacion(){
		for (int i = 0; i<calificacion.length; i++) {
			calificacion[i] = Calificacion.CERO;
		}
	}
	public void setCalificacion(Calificacion c, int indice){
		calificacion[indice] = c;
	}
	public float getPromedio(){

	}

	public Alumno(String nombre, int calificacion){
		super(nombre);
		this.calificacion = calificacion;
		if (calificacion>0 && calificacion<10) {
			System.out.println(calificacion);
		} else {
			calificacion = 5;
			System.out.println(calificacion);
		}
	}

	public boolean equals(Object o){
        boolean iguales = false;
        if (o != null && o instanceof Alumno) {
        	Alumno a = (Alumno) o;
        	if (nombre == a.nombre && calificacion == a.calificacion) {
        		iguales = true;
        	}
        }
        return iguales;
	}

	public String toString(){
		return ("Alumno: " + super.toString() + calificacion);
	}

	public void setPromedio(){

	}
}