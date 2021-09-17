package mx.tv.kishimoto.naruto.anime;
public class Personaje{
	private String nombre;
	private int poder;

	public Personaje(String nombre, int poder){
		this.nombre = nombre;
		int edad = 0;
	}

	public void setPoder(int poder){

	}

	public String getDatos(){
		return nombre + "\t" + poder;
	}

	
}