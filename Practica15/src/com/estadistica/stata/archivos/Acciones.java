package com.estadistica.stata.archivos;
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
		}catch (IOException io){
			io.printStackTrace();
		}
	}
}