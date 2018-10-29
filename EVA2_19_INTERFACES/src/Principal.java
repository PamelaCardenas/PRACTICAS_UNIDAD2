/*
 * Muestar empleo de las interfaces (Como clases abstractas)
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
    }
    
}

//Clase Caballo que implemeneta los métodos de la interface ComportamientoAnimal
class Caballo implements ComportamientoAnimal{ 

    //Métodos movimiento y comer sobreescritos de la interface a la clase Caballo
    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer pasto");
    }
    
}

//Son como clases abstractas:
    //No se pueden crear objetos de interfaces
    //No clases
    //Define un comportamiento estándar a una clase

/*CUANTOS TIPOS DE HERENCIA EXISTEN?
    SIMPLE
    MÚLTIPLE
*/

interface ComportamientoAnimal { //Creación de la interface

    //Métodos movimiento y comer que serán heredados a las otras clases
    public void movimiento();
    public void comer();
}
