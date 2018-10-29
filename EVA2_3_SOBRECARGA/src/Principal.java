/*
 * Mostrar lo que se denomina sobrecarga, es cuando se crean varios métodos con el mismo nombre, en la misma clase
 * pero con diferentes variables
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Creación del objeto de la clase operaciones
        Operaciones oObj = new Operaciones();

        //Imprime mensajes llamando los métodos de la clase operaciones
        System.out.println("La suma de 5 + 7 = " + oObj.suma(5, 7));
        
        System.out.println("La suma de Juan y Perez es " + oObj.suma("Juan ", "Perez"));
        
        System.out.println("true AND false ES " + oObj.suma(true, false));
    }
    
}


//Nueva clase
class Operaciones {

    //Método suma con valores enteros
    public int suma(int iVal1, int iVal2){
        return iVal1+iVal2; //SUMANDO
    }
    
    //Método suma con valores String, sumando cadenas de texto
    public String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;  //CONCATENANDO
    }
    
    //Método suma con valores booleanos
    public boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; //AND
    }
}