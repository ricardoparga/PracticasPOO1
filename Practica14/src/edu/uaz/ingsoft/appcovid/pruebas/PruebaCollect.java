package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
import edu.uaz.ingsoft.appcovid.utils.Tablero;
import edu.uaz.ingsoft.appcovid.utils.CmpSem;
import edu.uaz.ingsoft.appcovid.utils.CmpGrupo;
import java.util.LinkedList;
public class PruebaCollect {
	public static void main(String[] args) {
		LinkedList <Materia> lista = new LinkedList <Materia> ();
        lista.add(new Materia("Programacion"));
        lista.add(new Materia("Algoritmos"));
        lista.add(new Materia("S Operativos"));
        lista.add(new Materia("Algoritmos"));
        lista.add(new Materia("Programacion"));
	}
}