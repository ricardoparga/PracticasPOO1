public static void main(String[] args) {
	Personaje alumno = new Personaje();
	alumno.setNombre("Kobie Brayant");
	alumno.saludar();
	System.out.println("Modificando el nombre" + alumno.getNombre());
	alumno.setNombre("Michael Jackson");
	alumno.saludar();
}