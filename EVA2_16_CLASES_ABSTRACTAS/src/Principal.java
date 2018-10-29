/*
 * Mostrar uso de las clases abstractas
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
        
        /*CLASE ABSTRACTA:
        Una que no sirve para generar objetos, solo sirve como base para herencia*/
        
        Ostra oPalCocktail = new Ostra(); //Objeto de la clase Ostra
        oPalCocktail.movimiento(); //Impresión del método heredado de la clase Animal a Ostra
        
    }
    
}

//Se puede limitar la herenia con final
//Una clase con final -------> no se puede usar la clase para heredar
//FINAL --------> YA NO SE PUEDE HERERDAR DE OSTRA
final class Ostra extends Animal{ 
    
}

abstract class Animal{ //Clase abstracta Animal, solo hereda 
    public void movimiento(){
        System.out.println("Movimiento indefinido"); //Impresión de de mensaje de método Movimiento
    }
}

