package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class TestPersonaje{
	public static void main(String[] args) {
		Personaje alumno = new Personaje("Kal-EL");
		alumno.saludar();
		System.out.println("Nombre: " + alumno.getNombre() + "Edad: " + alumno.getEdad());
		System.out.println("Modificando el nombre: " + alumno.getNombre());
		alumno.setNombre("Michael Jordan");
		alumno.saludar();
		if (!alumno.setEdad(30)) {
			System.out.println("Edad sin cambios: ");
		}
		System.out.println("Nombre: " + alumno.getNombre() + "Edad: " + alumno.getEdad());
		System.out.println("Modificando edad en 130");
		if (!alumno.setEdad(130)) {
			System.out.println("Edad sin cambios: ");
		}
		System.out.println("Nombre: " + alumno.getNombre() + "Edad: " + alumno.getEdad());
    }
}