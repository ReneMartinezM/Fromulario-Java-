package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;




//import dao.Usuarios_DAO;
//import dao.Usuarios_DTO;



public class Conexion {
	

private static Connection connection = null;
	    
	
	public static  Connection connectDatabase() {
	        try {
		            // We register the PostgreSQL driver
		            // Registramos el driver de PostgresSQL
		            try { 
		                Class.forName("org.postgresql.Driver");
		            } catch (ClassNotFoundException ex) {
		                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		            }
		            connection = null;
		            // Database connect
		            // Conectamos con la base de datos
		            connection = DriverManager.getConnection(
		                    "jdbc:postgresql://localhost:5432/Formulario",
		                    "postgres", "donald301");
		 
		            boolean valid = connection.isValid(50000);
		            System.out.println(valid ? "TEST OK" : "TEST FAIL");
	        } catch (java.sql.SQLException sqle) {
	            System.out.println("Error: " + sqle);
	        }
	        return connection;
	    } 
	    /**
	     * Testing Java PostgreSQL connection with host and port
	     * Probando la conexión en Java a PostgreSQL especificando el host y el puerto.
	     * @param args the command line arguments
	     */
	   /* public static void main(String[] args) {
	        Conexion connexion = new Conexion();
	        connexion.connectDatabase(); 
	        Usuarios_DTO usuarios_DTO = new Usuarios_DTO("Rene", "Marks", 24, 100);
	        System.out.println("" + usuarios_DTO.getNombre());
	        Usuarios_DAO usuariosDao = new Usuarios_DAO();
	        
	        ArrayList<String> us=new ArrayList<String>();
	        ArrayList<Usuarios_DTO> usuarios;
	        usuarios=usuariosDao.traerUsuarios();
			
			for(int i=0;i<usuarios.size();i++) {
				
				us.add(usuarios.get(i).getApodo());
				System.out.print(us);
			}
	        
	        
	    }
	
	*/
	    
	    
	
	  

}//FIN CLASE CONEXION
