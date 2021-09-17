package mx.tv.kishimoto.naruto.anime;
public class Personaje{
	private String nombre;
	private int poder;

	public Personaje(String nombre, int poder){
		this.nombre = nombre;
		if (poder>=0 && poder<=500) { //Duda resuelta por compañero de clase
			this.poder = poder;
		} else {
			this.poder = 0;
		}
	}

	public void setPoder(int poder){
		int suma = this.poder + poder; //Duda resuelta por el profe
		if (suma>=500) {
			this.poder = 500;
		} else {
			if (suma<=0) {
				this.poder = 0;
			} else {
				this.poder = suma;
			}
		}
	}

	public String getDatos(){
		return nombre + "\t" + poder;
	}


}