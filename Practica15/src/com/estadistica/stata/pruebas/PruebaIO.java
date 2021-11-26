package com.estadistica.stata.pruebas;
import com.estadistica.stata.archivos.Municipio;
import com.estadistica.stata.archivos.Acciones;
import java.io.*;
import java.util.*;

public class PruebaIO{
	public static void main(String[] args) {
		File home = new File(System.getProperty("user.home"));

		if (!home.isDirectory()) {
			System.out.println("No se puede continuar");
			System.exit(-1);
		}

		String path = home+System.getProperty("file.separator");

		String[] contenido = home.list();
		
		System.out.println("Escibe el nombre del archivo: ");
		for (String v : contenido){
			File f = new File(path+v);
			if (f.isFile() && v.equals("datos.info")) {
				Acciones.procesar(path+v);
			}

		}

		ArrayList<Municipio> municipios = Acciones.getMunicipios();
		//System.out.println(municipios);

		Scanner s = new Scanner(System.in);

		String archivoOut = path+s.nextLine();

		char c = Acciones.getCharAleat();
		System.out.println("Los municipios que inician en "+c+" Se guardan en "+archivoOut);
		Acciones.guardarDatos(archivoOut, c);
	}
}