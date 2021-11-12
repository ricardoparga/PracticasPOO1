package edu.uaz.ingsoft.appcovid.cursos;
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

    
}