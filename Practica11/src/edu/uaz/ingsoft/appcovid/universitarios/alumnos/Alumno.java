package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.utils.Calificacion;
public class Alumno extends Universitario{
	private float promedio;
	private Calificacion[] calificacion = new Calificacion[5];

	//Constructores
	public Alumno(String nombre){
		super(nombre);
		setCalificacion();
		getPromedio();
	}

	//Metodos
	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Alumno)){
			Alumno m = (Alumno) o;
			if ( (this.getNombre().equals(m.getNombre())) && (this.promedio == m.promedio)){
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int calif = (int) (promedio);
		return super.hashCode()*calif;
	}

	public String toString(){
		String cadena = " ";

		for (int i = 0; i <  calificacion.length; i++){
			cadena = cadena + calificacion[i].getCalif();
		}

		return ("Alumno " + super.toString() + " con las calificaciones \t" + cadena + "\t obtuvo el promedio\t" + promedio);
	}

	public String getNombre(){
		return super.getNombre();
	}

	public void setCalificacion(){
		for (int i = 0; i <  calificacion.length; i++) {
			calificacion[i] = Calificacion.CERO;
		}
	}
	int suma = 0;
	public void setCalificacion(Calificacion c, int indice){
		calificacion[indice] = c;
		getPromedio();
	}

	public float getPromedio(){
		for (int i = 0 ; i < calificacion.length ; i++ ) {
			suma = suma + calificacion[i].getCalif();
		}
		promedio = suma/calificacion.length;
		return promedio;
	}
}


