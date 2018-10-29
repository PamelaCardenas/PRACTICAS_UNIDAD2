/*
 * Mostrar uso de las clases abstractas y el override
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
 
        //Objeto de clase Caballo
        Caballo cHorse = new Caballo();
        cHorse.movimiento(); //Impresión de método movimiento heredado de la clase Animal a Caballo
        
    }
    
}
class  Caballo extends Animal{ //Clase Caballo que hereda métodos de la clase Animal
    @Override //Se sobreescribe el método movimiento de la clase Animal
    public void movimiento(){
        super.movimiento(); //Llama al método movimiento de la clase Padre
        System.out.println("Galopar"); //Muestra nuevo mensaje en el método
    }
}

abstract class Animal{ //Clase abstracta Animal
    public void movimiento(){ //Método movimiento que imprime un mensaje
        System.out.println("Algún tipo de movimiento");
    }
}
