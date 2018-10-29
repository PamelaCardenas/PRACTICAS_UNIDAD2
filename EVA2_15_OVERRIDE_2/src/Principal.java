/*
 * Muestra el uso del Override (Para sobreescribir métodos)
 */

/**
 *
 * @author Karla Pamela C�rdenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         //Creaci�n de objeto de la clase Animal
        Animal aAni = new Animal();
        aAni.movimiento(); //Imprime el m�todo movimiento de la clase Animal

        //Creaci�n de objeto de la clase Caballo
        Caballo cHorse = new Caballo();
        cHorse.movimiento(); //Imprime método movimiento de la clase Caballo el cual esta sobreescrito

        //Creaci�n de objeto de la clase Ostra
        Ostra aOstra = new Ostra();
        aOstra.movimiento();  //Imprime método movimiento de la clase Ostra el cual esta sobreescrito
    }
    
}
 

//Nueva clase llamada Caballo que hereda los m�todos de la clase Padre (Animal)
class Caballo extends Animal{
    
    @Override //--------> Sustituir el comportamiento de la clase base con el comportamiento propio de la subclase
    public void movimiento(){
        System.out.println("Galopar"); //Imprimir nuevo mensaje en el método sobreescrito
    }
}

class Ostra extends Animal{ //Clase Ostra que hereda los métodos de la clase Animal
    
}

class Animal{
    public void movimiento(){ //método movimiento
        System.out.println("Movimiento indefinido"); //Imprmir mensaje 
    }
}
