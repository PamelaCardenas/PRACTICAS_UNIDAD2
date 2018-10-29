/*
 * Mostrando el uso de los métodos estáticos;
 * Solo pueden usarse dentro de una clase estática
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

        //Operaciones oObj = new Operaciones();  Creación de un objeto
        //Impresión de mensajes llamando la variable estática declarada en la clase Operaciones
        System.out.println("Hola" + Operaciones.iValor);
        System.out.println(Math.cos(50)); //Sacar coseno de 50 llamando la función de la clase Math
    }
    
}

//Nueva clase
class Operaciones {
    static int iValor = 100; //Variable de tipo entero estática

    //Método estático que suma dos variables de tipo entero
    public static int suma(int iVal1, int iVal2){
        return iVal1+iVal2; //SUMANDO
    }
    
    //Método estático que suma dos variables de tipo String
    public static String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;  //CONCATENANDO
    }
    
    //Método estático que suma dos variables de tipo booleanos
    public static boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; //AND
    }
}
