package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class Ventana extends JFrame{
	public Acciones acc;
	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem miStart;
	private JMenuItem miExit;

	public Ventana(){
		acc = new Acciones(this);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu = new JMenu("Archivo");
		mb.add(menu);
		setJMenuBar(mb);
		miStart = new JMenuItem("Iniciando hilo...");
		miExit = new JMenuItem("Saliendo del hilo...");
		menu.add(miStart);

		miStart.addActionListener(new addActionListener(){
			public void actionPerformed(ActionEvent e){
				acc.iniciar();
			}
		});

		menu.addSeparator();
		menu.add(miExit);

		miExit.addActionListener(new addActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		JLabel elem1 = new JLabel("Elemento1");
		JLabel elem2 = new JLabel("Elemento2");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(mb);
	}

	
}