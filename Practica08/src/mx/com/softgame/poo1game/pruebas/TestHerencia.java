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

		Personaje [] personajes {per01, per02, plan01, plan02, plan03, plan04, zom01, zom02, zom03};
		for (Personaje i: personajes) {
			System.out.println(i.getDetalle());
			if (i instanceof Planta) {
				Planta p = (Planta)i;
				System.out.println("Soy una planta" + p.getEscudo());
			}
			if (i instanceof Zombie) {
				Zombie z = (Zombie)i;
				System.out.println("Soy Zombie" + z.getAtaque());
			}
			int a = (int)(Math.random()*10);
			i.decVida(a);
			System.out.println(a);
			System.out.println(i.getDetalle());
		}
	}
}