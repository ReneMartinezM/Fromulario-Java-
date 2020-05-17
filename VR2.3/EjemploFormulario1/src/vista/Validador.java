package vista;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dachm
 */
public class Validador {
    
    public static boolean campoVacio(String valor){
    
     return (valor.trim().isEmpty());
    }
    
    public static boolean verifica_numerico(String valor){
    
    try{
       Integer.parseInt(valor);
       return true;
    }catch(Exception e){
    
       return false;
    }
    }
    
    public static boolean validaRFC(String valor){
        System.out.println("RFC:"+valor);
    return Pattern.matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}", valor);
    }
    
    
    public static boolean verificaRangoEntero(String valor,int sup, int inf){
        
        if(verifica_numerico(valor)){
            int val= Integer.parseInt(valor);
             if(val>=inf && val<=sup){
                return true;
             }
        }
        return false;   
    }
    
    
    
    
}
