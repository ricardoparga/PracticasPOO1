package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class TestPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje ("Fernando");
		Personaje per02 = new Personaje ("Miriam");
		Personaje per03 = new Personaje ("Christian");
		Personaje per04 = new Personaje ("Valeria");

		int ed;
		int n = 0;
		int m = 0;
		while (n >= m){
			n = (int)(Math.random()*100);
			m = (int)(Math.random()*100);
		}
		int i;
		outfor:
		for (i=n; i<=m; i++) {
			ed = (int)(Math.random()*250);
			if (per01.setEdad(ed)) {
				System.out.println(per01.getDetalle() + ", se modifico la edad ");
			}
			else {
				System.out.println(per01.getDetalle() + ", sin modificacion de edad a: " + ed);
			}
			ed = (int)(Math.random()*250);
			if (per02.setEdad(ed)) {
				System.out.println(per02.getDetalle() + ", se modifico la edad ");
			}
			else {
				System.out.println(per02.getDetalle() + ", sin modificacion de edad a: " + ed);
			}
			ed = (int)(Math.random()*250);
			if (per03.setEdad(ed)) {
				System.out.println(per03.getDetalle() + ", se modifico la edad ");
			}
			else {
				System.out.println(per03.getDetalle() + ", sin modificacion de edad a: " + ed);
			}
			ed = (int)(Math.random()*250);
			do{
				ed = (int)(Math.random()*250);
				System.out.println(ed);
				if (ed == 150) {
					System.out.println("***Bingo 150***");
					continue outfor;
				}
			}
			while (!per04.setEdad(ed));
			System.out.println(per04.getDetalle());
		}
    }
}
