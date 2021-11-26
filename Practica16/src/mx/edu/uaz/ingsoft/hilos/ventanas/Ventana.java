package mx.edu.uaz.ingsoft.hilos.ventanas;
import mx.edu.uaz.ingsoft.hilos.elementos.Elemento;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{
	public Acciones acc;
	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem miStart;
	private JMenuItem miExit;
	JLabel elem1 = new JLabel("Elemento1");
	JLabel elem2 = new JLabel("Elemento2");

	public Ventana(){
		acc = new Acciones(this);
		mb = new JMenuBar();
		setJMenuBar(mb);
		menu = new JMenu("Archivo");
		mb.add(menu);
		setJMenuBar(mb);
		miStart = new JMenuItem("Iniciar hilo");
		miExit = new JMenuItem("Salir del hilo");
		menu.add(miStart);

		miStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				acc.iniciar();
			}
		});


		menu.addSeparator();
		menu.add(miExit);

		miExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(mb);
	}

	public void mostrarVentana(){
		add(elem1, BorderLayout.NORTH);
		add(elem2, BorderLayout.SOUTH);
		setSize(800,200);
		setVisible(true);
	}

	public JLabel getEtiqueta1(){
		return elem1;
	}

	public JLabel getEtiqueta2(){
		return elem2;
	}
}