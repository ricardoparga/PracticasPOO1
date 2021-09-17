package mx.tv.kishimoto.naruto.pruebas;
import mx.tv.kishimoto.naruto.anime.Personaje;
public class Escena{
	public static void main(String[] args) {
		Personaje naruto = new Personaje ("Naruto", 1000);
		Personaje sasuke = new Personaje ("Sasuke", -10);
		Personaje sakura = new Personaje ("Sakura", 300);

		System.out.println(naruto.getDetalle());
		System.out.println(sasuke.getDetalle());
		System.out.println(sakura.getDetalle());
		System.out.println("_ _ _");

		
	}
}