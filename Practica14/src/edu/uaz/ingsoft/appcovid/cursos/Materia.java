package edu.uaz.ingsoft.appcovid.cursos;
import java.lang.Comparable;
public class Materia implements Comparable <Materia> {
	private final String clase;
    private int semestre;
    private char grupo;

    public Materia(String clase){
    	this.clase = clase;
        this.semestre = 1;
        this.grupo = 'A';
    }

    public final String getClase(){
    	return clase;
    }
    public int getSemestre() {
        return semestre;
    }
    public char getGrupo() {
        return grupo;
    }

    public void setSemestre(int semestre) {
        if((semestre>=1) && (semestre<=16)){
            this.semestre=semestre;
        }
    }
    public void setGrupo(char grupo) {
        if(Character.isAlphabetic(grupo)){
            this.grupo = grupo;
        }
    }

    public int compareTo(Materia m) {
        if (clase.compareTo(m.clase)!= 0) {
            return clase.compareTo(m.clase);
        }

        if ((semestre - m.semestre)!=0) {
            return semestre - m.semestre;
        }

        return ((int)grupo) - ((int)m.grupo);
    }

    public String toString() {
        return clase + "\t" + semestre + "\t " + grupo;
    }
}