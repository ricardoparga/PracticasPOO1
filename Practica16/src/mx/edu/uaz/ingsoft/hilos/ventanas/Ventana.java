package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
	public Acciones acc;
	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem iniciar;
	private JMenuItem salir;

	public Ventana(){
		acc = new Acciones(this);
		
	}

}