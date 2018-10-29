
/*
 * Mostrar el uso de constructores 
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
        //JAVA en automático crea un constructor default en sus clases cuando no es declarado por el programador
        
        // TODO code application logic here

                            //CONSTRUCTOR (Sirve para inicializar la clase)
        Principal pObjPpal = new Principal();
        //Instanciación de un objeto de la clase Prueba 
        Prueba pObjPrue = new Prueba(); 
        System.out.println(pObjPrue.X); //Mostrar el valor de la variable inicializada en el constructor de la clase Prueba
    }
    
}
//Clase llamada Prueba
 class Prueba{
        int X; //Declaración de una variable

    public Prueba() { //Constructor llamado Prueba
    
        X = 100; //Inicialización de una variable
    }
  }