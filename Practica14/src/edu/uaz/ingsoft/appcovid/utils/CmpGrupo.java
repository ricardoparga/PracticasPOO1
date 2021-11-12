package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
import java.util.Comparator;
public class CmpGrupo implements Comparator <Materia> {
    public int compare(Materia m1, Materia m2) {
        return ((int)m1.getGrupo()) - ((int)m2.getGrupo());
    }
}