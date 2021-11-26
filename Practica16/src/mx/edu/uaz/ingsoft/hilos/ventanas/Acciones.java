package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;

public class Acciones{
	public Ventana v;

	public Acciones(Ventana v){
		this.v = v;
	}

	public void iniciar(){
		Elemento e1 = new Elemento(v.getEtiqueta(), 'X');
		Elemento e2 = new Elemento(v.getEtiqueta(), 'Y');
		e1.start();
		e2.start();
	}
}