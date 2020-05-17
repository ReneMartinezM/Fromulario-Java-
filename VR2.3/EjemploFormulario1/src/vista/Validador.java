package vista;

public class Validador {

	
	public static boolean campoVacio(String valor) {		
		return (valor.trim().isEmpty());// is empty, regresa un verdadero
	}
	
	public static boolean  verificaNumerico(String valor) {
		// TODO Auto-generated method stub
		
		try {
			Integer.parseInt(valor);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
				
	}
	
	
}
//FIN CLASE