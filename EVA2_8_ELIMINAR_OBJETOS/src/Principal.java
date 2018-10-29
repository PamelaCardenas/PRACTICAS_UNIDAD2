/*
 * Creación de copias de variables y como eliminar objetos
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
        //Crear objeto de la clase Test
        Test tObj = new Test();
        Test tCopia = tObj; //Copia del objeto de la clase Test
        tObj.iVal = 100; //Asignar valor a la variable de la clase Test
        System.out.println(tObj.iVal); //Mostrar valor de la variable
        System.out.println(tObj);  //Mostrar la ubicación del objeto
        System.out.println(tCopia); //Mostrar la ubicación de la copia del objeto
        tObj = new Test(); //Nueva ubicación
        System.out.println("Señor Slim, usted tiene: " + tObj.iVal); //Mensaje con el valor de la variable
        System.out.println(tObj); //Muestra la nueva ubicación del objeto
        tObj = null; //Eliminar objeto
        System.out.println(tObj); //Muestra que el objeto no existe
        System.out.println("Pereme Sr Slim, tiene: " + tCopia.iVal); //Muestra el valor de la copia del objeto
    }
    
}

//Nueva clase
class Test{
    int iVal; //Creación de variable
}