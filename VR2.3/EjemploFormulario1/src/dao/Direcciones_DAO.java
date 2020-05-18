package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Conexion;


public class Direcciones_DAO {
	
	 
	
///atributos///
	
	
	private final String sqlS1="SELECT * FROM Usuarios;";
	
	private static PreparedStatement psS1 = null;
	
	private Connection con;
	
	
///constructores////
	public Direcciones_DAO() {
		con = Conexion.connectDatabase();	
		//direcciones = new ArrayList<Direcciones_DTO>();
	}
	
	

////METODOS////////
	public void actualizaScore(int nScore, int pos) throws SQLException {

		//psS1 = con.prepareStatement("UPDATE usuarios SET score =" + nScore + "WHERE score =" + usuarios.get(pos) + "");
		
	}
	
	
	
	public void guardaDirecciones(Direcciones_DTO direccion){
		
	
			
			try {
					psS1 = con.prepareStatement("INSERT INTO direcciones VALUES (?,?,?,?,?)");
					
					psS1.setString(1,"direcciones_seq.nextval");
					psS1.setString(2,"adoptantes_seq.nextval");
					psS1.setString(3,direccion.getCalle());
					psS1.setInt(4,direccion.getNumExt());
					psS1.setString(5,direccion.getColonia());
					
			   } catch (SQLException e)
				{
				   // TODO Auto-generated catch block
				   e.printStackTrace();
				}
			
		
		
	}
	
	 
	
}
