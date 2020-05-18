package focade;

import java.util.ArrayList;

import dao.Direcciones_DAO;
import dao.Direcciones_DTO;

public class Formulario {

	
	
	private Direcciones_DTO direccionDTO;
	private  Direcciones_DAO direccionesDAO;
	
	
	
	public void Formulario() {
		direccionDTO = new Direcciones_DTO();
	}
	
	public void insertaNuevaDireccion() {
		direccionesDAO.guardaDirecciones(direccionDTO);
	}
	
	
	 
	
	
	
}
