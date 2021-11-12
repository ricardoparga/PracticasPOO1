package edu.uaz.ingsoft.appcovid.utils;
import edu.uaz.ingsoft.appcovid.cursos.Materia;
import java.util.Comparator;
public class CmpSem implements Comparator <Materia> {
    public int compare(Materia m1, Materia m2) {
        return (m2.getSemestre() - m1.getSemestre());
    }
}