public class Personaje{
	private String nombre;
	private int edad;

	public void setNombre(nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public int saludar(){
		System.out.println("Hola alumno de POO" + nombre);
	}
}