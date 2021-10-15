package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class TestPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje ("Aline");
		Personaje per02 = new Personaje ("Valeria");
		Personaje per03 = new Personaje ("Federico");
		Personaje per04 = new Personaje ("Mayela");
		Personaje per05 = new Personaje ("Edwin");

		per01.setEdad(20);
		per02.setEdad(10);
		per03.setEdad(1);
		per04.setEdad(-10);
		per05.setEdad(500);

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

		per07.setEdad((int)(Math.random()*1000));
		per09.setEdad((int)(Math.random()*1000));

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
    }
}
