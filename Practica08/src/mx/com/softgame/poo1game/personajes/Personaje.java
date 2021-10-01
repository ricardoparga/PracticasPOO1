package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre){
		this.nombre = nombre;
		this.vida = vida; //Poner edad en 0
	}
	public void setNombre(String nombre){
		if (nombre.length()>3 && nombre.length()<20) {
			this.nombre=nombre;
		}
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola alumno de POO " + nombre);
	}
	public int getVida(){
		return vida;
	}
	public boolean setVida(int vida){
		if (edad>0 && edad<100) {
			this.vida = vida;
			return true;
		}
		else {
			return false;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + edad;
	}
}