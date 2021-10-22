package edu.uaz.ingsoft.appcovid.utils;
public enum Calificacion{
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
	public int calif = 0;

	private Calificacion(int calif){
		this.calif = calif;
	}
	public int getCalif(){
		return calif;
	}
}