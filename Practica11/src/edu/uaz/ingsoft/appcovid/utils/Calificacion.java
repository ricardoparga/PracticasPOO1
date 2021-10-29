package edu.uaz.ingsoft.appcovid.utils;
public enum Calificacion{
	CERO(0),
	UNO(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	OCHO(8),
	NUEVE(9),
	DIEZ(10);

	private final int calif;

	private Calificacion(int calif){
		this.calif = calif;
	}

	public int getCalif(){
		return calif;
	}
}