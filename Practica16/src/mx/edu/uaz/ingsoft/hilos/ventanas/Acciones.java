package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;

public class Acciones{
	public Ventana v;

	public Acciones(Ventana v){
		this.v = v;
	}

	public void iniciar(){
		Elemento e1 = new Elemento('X', v.getEtiqueta1());
		Elemento e2 = new Elemento('Y', v.getEtiqueta2());
		e1.start();
		e2.start();
	}
}