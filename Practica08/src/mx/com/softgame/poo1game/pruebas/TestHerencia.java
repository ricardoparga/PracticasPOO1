package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class TestHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje ("Miguel", 99);
		Personaje per02 = new Personaje ("Sarahi");
		Planta plan01 = new Planta ("Angel", 10, 'B');
		Planta plan02 = new Planta ("Giovana", 50);
		Planta plan03 = new Planta ("Antonio", 'C');
		Planta plan04 = new Planta ("Valeria");
		Zombie zom01 = new Zombie ("Alan", 80, false);
		Zombie zom02 = new Zombie ("Mayela", true);
		Zombie zom03 = new Zombie ("Carlos");

		
	}
}