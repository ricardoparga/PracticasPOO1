package com.estadistica.stata.pruebas;
import com.estadistica.stata.archivos.Municipio;
import com.estadistica.stata.archivos.Acciones;
public class PruebaIO{
	public static void main(String[] args) {
		File home = new File(System.getProperty("user.home"));

		if (!home.isDirectory()) {
			System.out.println("No se puede continuar");
			System.exit(-1);
		}

		String path = home+System.getProperty("file.separator");

		String[] contenido = home.list();

		for (String v : contenido){
			File f = new File(path+v);
			if (f.isFile() && v.equals("datos.info")) {
				procesar(path+v);
			}

		}


	}
}