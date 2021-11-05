package edu.uaz.ingsoft.appcovid.utils;
public class TableroException extends Exception{
	int index = 0;

	public TableroException(String msg, int index){
		this.msg = msg;
		this.index = index;
	}

	public int getIndex(){
		return index;
	}
}