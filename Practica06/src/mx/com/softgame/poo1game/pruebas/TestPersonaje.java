package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class TestPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje ("Aline", 20);
		Personaje per02 = new Personaje ("Valeria", 10);
		Personaje per03 = new Personaje ("Federico", 1);
		Personaje per04 = new Personaje ("Mayela", -10);
		Personaje per05 = new Personaje ("Edwin", 500);

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		per06.setNombre("Patrick Alberto Camilo");
		per08.setNombre("Hanna");
		per10.setNombre("Jorge Abraham");

		
    }
}
