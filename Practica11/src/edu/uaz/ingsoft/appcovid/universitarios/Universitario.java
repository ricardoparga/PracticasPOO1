package edu.uaz.ingsoft.appcovid.universitarios;

public class Universitario{
	public String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object o){
        boolean iguales = false;
        if (o != null && o instanceof Universitario) {
        	Universitario u = (Universitario) o;
        	if (nombre == u.nombre) {
        		iguales = true;
        	}
        }
        return iguales;
	}

	@Override
	public int hashCode(){
		int hash = 1;
		hash = hash * 31 + ((nombre == null) ? 0 : nombre.hashCode());
		return hash;
	} 

	public String toString(){
		return nombre;
	}
}