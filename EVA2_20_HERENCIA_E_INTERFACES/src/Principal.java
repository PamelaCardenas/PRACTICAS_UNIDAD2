/*
 * Mostrar el empleo de interfaces, así como la simulaci�n de la herencia múltiple
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

        //Creación de objeto de la clase Hijo
        Hijo hObj = new Hijo();

        //Muestra los los métodos que fueron heredados a la clase Hijo
        hObj.algo();
        hObj.mensaje();
        hObj.otroMensaje();
    }
    
}

//Clase hijo que hereda los métodos de la clase Padre, junto con las interfaces Accesorio y AlgoMas
class Hijo extends Padre implements Accesorio, AlgoMas{ 

    //Métodos sobreescritos de las interfaces Accesorio y AlgoMas
    @Override
    public void mensaje() {
        
    }

    @Override
    public void otroMensaje() {
       
    }
    
}

class Padre{
    public void algo(){ //Método de la clase Padre
        System.out.println("Mensaje de la clase base");
    }
    
    
}

interface Accesorio{
    public void mensaje(); //Método de la interface Accesorio
}

interface AlgoMas{
    public void otroMensaje(); //Método de la interface AlgoMas
}