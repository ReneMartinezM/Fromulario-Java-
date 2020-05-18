package dao;

import java.util.ArrayList;

public class Direcciones_DTO {
	

	//ATRIBUTOS
	private String calle;
	private int numExt;
	private String colonia;
	private ArrayList<Direcciones_DTO> direcciones;
	

	
	
	
	
	//CONSTRUCTORES
	public Direcciones_DTO(String calle, int numExt, String colonia) {
		
		this.calle    = calle;
		this.numExt   = numExt;
		this.colonia  = colonia;
		 direcciones  = new ArrayList<Direcciones_DTO>();
	}
	
	
	//GETERS AND SETTER

	
	public ArrayList<Direcciones_DTO> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(ArrayList<Direcciones_DTO> direcciones){
		this.direcciones = direcciones;
	}

	public Direcciones_DTO() {
		// TODO Auto-generated constructor stub
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
