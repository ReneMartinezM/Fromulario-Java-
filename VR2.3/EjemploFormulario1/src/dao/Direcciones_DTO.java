package dao;

import java.util.ArrayList;

public class Direcciones_DTO {
	

	//ATRIBUTOS
	private String calle;
	private int numExt;
	private String colonia;
	
	

	
	
	
	//CONSTRUCTORES
	public Direcciones_DTO () {
		this.calle = " ";
		numExt = 0;
		colonia = " ";
	}
	public Direcciones_DTO(String calle, int numExt, String colonia) {
		
		this.calle    = calle;
		this.numExt   = numExt;
		this.colonia  = colonia;
		 
	}
	
	
	
	

	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumExt() {
		return numExt;
	}
	public void setNumExt(int numExt) {
		this.numExt = numExt;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	
	
	

}
