package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.utils.Calificacion;
import edu.uaz.ingsoft.appcovid.utils.Tutorias;
public class Alumno extends Universitario implements Tutorias{
	private float promedio;
	Calificacion[] calificacion = new Calificacion[5];
	public int i = 0;

	public Alumno(String nombre){
		super(nombre);
		setCalificacion();
		getPromedio();
	}

	public void realizarTutoria(){
		String mostrar = " ";
		for (i=0; i<calificacion.length; i++) {
			mostrar = mostrar + calificacion[i].getCalif();
		}
		System.out.println("Recibe tutorias: " + mostrar);
	}

	public void getNota(){
		String mostrar = " ";
		for (i=0; i<calificacion.length; i++) {
			mostrar = mostrar + calificacion[i].getCalif();
		}
		System.out.println("Calificaciones actuales: " + mostrar + "Promedio actual: " + getPromedio());
	}

	private static Calificacion getCalifAleatoria() {
        int rand = (int) (Math.random()*10);
        switch (rand) {
            case 1:
                return Calificacion.UNO;
            case 2:
                return Calificacion.DOS;
            case 3:
                return Calificacion.TRES;
            case 4:
                return Calificacion.CUATRO;
            case 5:
                return Calificacion.CINCO;
            case 6:
                return Calificacion.SEIS;
            case 7:
                return Calificacion.OCHO;
            case 8:
                return Calificacion.NUEVE;
            default:
                return Calificacion.CERO;
        }
    }
	
	public void llenarCalificaciones(){
		for (i=0; i<calificacion.length; i++) {
			Calificacion c = getCalifAleatoria();
			setCalificacion(c, i);
		}
	}

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

	public void setCalificacion(Calificacion c, int indice){
		calificacion[indice] = c;
		getPromedio();
	}

	public float getPromedio(){
		int suma = 0;
		for (int i = 0 ; i < calificacion.length ; i++ ) {
			suma = suma + calificacion[i].getCalif();
		}
		promedio = suma/calificacion.length;
		return promedio;
	}
}


