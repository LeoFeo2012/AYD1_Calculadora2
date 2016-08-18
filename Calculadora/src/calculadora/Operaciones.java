/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;



/**
 *
 * @author Montenegro
 */
public class Operaciones {
        
    public String insertar(String val,String txt_val1,int posicion){
            int tamanio_cadena=txt_val1.length();
            String temp=txt_val1.substring(0,posicion);
            temp=temp+val;
            return temp+txt_val1.substring(posicion,tamanio_cadena);
    }
    
    public int suma(int val1,int val2){
        return val1+val2;
    }
    public int resta(int val1,int val2){
        return val1-val2;
    }
    public int division(int val1,int val2){
        return val1/val2;
    }
    public int multiplicacion(int val1,int val2){
        return val1*val2;
    }
    
}
