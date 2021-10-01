package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Planta extends Personaje{
	public char escudo;

	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}


	public char getEscudo(){
		return escudo;
	}
}