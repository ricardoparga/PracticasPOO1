package edu.uaz.ingsoft.appcovid.universitarios;
public abstract class Universitario{
	private String nombre;

	public Universitario(String nombre){
		this.nombre = nombre;
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o != null) && (o instanceof Universitario)){
			Universitario u = (Universitario) o;
			if (nombre.equals(u.nombre)) {
				result = true;
			}
		}
		return result;
	}

	public int hashCode(){
		int nom = nombre.hashCode();
		return nom;
	}
	public String toString(){
		return nombre;
	}
	public String getNombre(){
		return nombre;
	}

	public abstract void getNota(){
		
	}
}