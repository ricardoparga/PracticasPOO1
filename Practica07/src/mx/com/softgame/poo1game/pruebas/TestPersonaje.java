package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class TestPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje ("Fernando");
		Personaje per02 = new Personaje ("Miriam");
		Personaje per03 = new Personaje ("Christian");
		Personaje per04 = new Personaje ("Valeria");

		
		int n = 0;
		int m = 0;
		while (n >= m){
			n = (int)(Math.random()*100);
			m = (int)(Math.random()*100);
		}
		
    }
}
