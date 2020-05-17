package dao;

import java.sql.Connection;

import modelo.Conexion;

public class Direcciones_DAO {
	private Connection con;
	
	public Direcciones_DAO() {
		con = Conexion.connectDatabase();	
	}
	 
	
}
