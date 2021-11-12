package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.utils.Tablero;
import edu.uaz.ingsoft.appcovid.utils.TableroException;
public class PruebaExcep{
	public static void main(String[] args) {
		try {
			Tablero.insertar(new Maestro("Cristian", 10000f));
			Tablero.insertar(new Maestro("Jorge", 100000f));
			Tablero.insertar(new Alumno("Valeria"));
			Tablero.insertar(new Maestro("Federico", 5f));
			Tablero.insertar(new Alumno("Hanna"));
			Tablero.insertar(new Alumno("Miriam"));
		} catch (TableroException e){
			System.out.println(e);
		}
		Tablero.mostrar();

		Universitario[] personas = Tablero.getPersonas();
        for (Universitario q : personas) {
            if (q instanceof Alumno) {
                ((Alumno)q).llenarCalificaciones();
            }
        }
        Tablero.mostrar();

        Maestro u1 = new Maestro("Patrick", 100f);
        Alumno u2 = new Alumno("Sarahi");
        u2.llenarCalificaciones();

        for (int i = 0; i < 10; i++) {
        	int rand = (int) (Math.random()*20);
        	if (i % 2 == 0) {
                try {
                   	Tablero.insertar(u1, rand);
                    Tablero.insertar(u2,rand+1);
                } catch (TableroException e) {
                    System.out.println(e + " " + e.getIndex());
                } else {
        			try {
        				Tablero.borrar(rand);
        			} 	catch (TableroException e){
        				System.out.println(e + " " + e.getIndex());
        			}
        		}
			}
		}
		Tablero.mostrar();
	}
}