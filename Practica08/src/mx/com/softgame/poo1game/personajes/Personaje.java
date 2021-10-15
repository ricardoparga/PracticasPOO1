package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this.nombre = nombre;
		int vida = 3;
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int restaVida){
		if ((vida-restaVida>0)) {
			vida = vida-restaVida;
		} //Termino 8:25
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
		if (vida>0 && vida<100) {
			this.vida = vida;
			return true;
		}
		else {
			return false;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + vida;
	}
}