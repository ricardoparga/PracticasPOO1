package com.estadistica.stata.archivos;
import java.io.*;
import java.util.*;

public class Municipio{
	private short id;
	private String nombre ="";
	private int poblacion = 0;

	public Municipio(short id, String nombre, int poblacion){
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public short getId(){
		return id;
	}
	public String getNombre(){
		return nombre;
	}
	public int getPoblacion(){
		return poblacion;
	}
	public String toString(){
		return "{"+ id + "\t"+ nombre + "\t" + poblacion +"}";
	}
}