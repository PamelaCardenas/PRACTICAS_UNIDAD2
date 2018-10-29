/*
 * Ejemplo de como se maneja la memoria de un programa, definiendo una variable y una copia, para que al asignar un nuevo valor a la 
 * variable principal no se pierda ya que esta guardado en la copia de la variable.
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

        //REFERENCIAS: VARIABLE QUE GUARDA UNA DIRECCIÓN EN MEMORIA
        //APUNTADORES
        Prueba pObj = new Prueba();
        pObj.iValor = 100;
        System.out.println("El valor es " + pObj.iValor);
        
        //COPIA
        int iAlgo = 70; //Valor de la variable
        int iCopia = iAlgo;  //La copia tendrá el valor de la variable principal
        System.out.println("iAlgo = " + iAlgo); //Mostrar variable principal
        System.out.println("iCopia = " + iCopia); //Mostrar copia

        iAlgo = 1000; //Nuevo valor a la variable principal
        System.out.println("iAlgo = " + iAlgo); //Mostrar variable principal
        System.out.println("iCopia = " + iCopia); //Mostrar la copia (Aqui se queda almacenado el primer valor que fue asignado al inicio)
        
        //COPIA DEL OBJETO
        Prueba pCopiaObj = pObj; //Nuevo objeto que guarda el valor del primer objeto creado
       //Mostrar los valores de ambos objetos 
       System.out.println("El valor es " + pObj.iValor);
       System.out.println("El valor de la copia es " + pCopiaObj.iValor);
       
       pObj.iValor = 99999; //Nuevo valor al primer objeto
       /*Se muestran los valores de ambos objetos pero ambos cambian al nuevo valor asignado, ya que estan almacenados en el mismo
       lugar de memoria.
       Para crear la copia de un objeto se deben de copiar cada uno de sus elementos*/
       System.out.println("El valor es " + pObj.iValor);
       System.out.println("El valor de la copia es " + pCopiaObj.iValor);
    }
    
}
//Nueva clase
class Prueba{
    int iValor; //4 BYTES
}
