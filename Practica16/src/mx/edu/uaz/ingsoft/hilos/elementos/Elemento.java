package mx.edu.uaz.ingsoft.hilos.elementos;
import javax.swing.*;

public class Elemento extends Thread{
	public char c;
	public JLabel etiqueta;

	public Elemento(char c, JLabel etiqueta){
		this.c = c;
		this.etiqueta = etiqueta;
	}

	public void run(){
		String out = " ";
		for (int i = 0; i < 31; i++) {
			out += c;
			etiqueta.setText(out);
			try{
				Thread.sleep(500);
			} catch(InterruptedException ie){
				System.err.println(ie);
			}
			System.out.println(out);
		}
		out += "***Finalizado***";
		etiqueta.setText(etiqueta.getText() + out);
	}
}