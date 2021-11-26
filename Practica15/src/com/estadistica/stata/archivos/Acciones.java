package com.estadistica.stata.archivos;
import java.io.*;
import java.util.*;

public class Acciones{
	private static ArrayList<Municipio> municipios;

	public static boolean esArchivo(String s){
		String path = System.getProperty("user.home") + System.getProperty("file.separator") + s;
		File archivo = new File(path);
		return archivo.isFile();
	}

	public static void procesar(String s){
		municipios = new ArrayList<Municipio>();
		try{
			FileReader fr = new FileReader(s);
			BufferedReader br = new BufferedReader(fr);
			try{
				String linea;
				linea = br.readLine();
				while (linea != null){
					String[] datos = linea.split(";");
					Short id = Short.parseShort(datos[0]);
					int poblacion = Integer.parseInt(datos[2]);
					municipios.add(new Municipio(id, datos[1],poblacion));
					linea = br.readLine();
				}
			}finally{
				br.close();
			}
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

	public static ArrayList<Municipio> getMunicipios(){
		if (municipios != null){
			return municipios;
		}
		return new ArrayList<Municipio>();
	}

	public static char getCharAleat(){
		return Character.toUpperCase((char)(Math.random()*40 + 65));
	}

	public static void guardarDatos(String s, char c){
		int totalPob = 0;
		if (municipios == null){
			return;
		}
		try{
			FileWriter fw = new FileWriter(s);
			BufferedWriter bw = new BufferedWriter(fw);
			try{
				for (Municipio m : municipios) {
					if (m.getNombre().charAt(0) == c) {
						bw.write(m.toString());
						totalPob = totalPob + m.getPoblacion();
					}
				}
				bw.write("La poblacion total es: " + totalPob);

			} finally{
				bw.close();
			}
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
}