/*
 * Uso de los métodos abstractos, empleando clases abstractas y el override
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
        
        //Objeto de la clase Caballo
        Caballo cHorse = new Caballo();
        //Impresión de los métodos sobreescritos
        cHorse.movimiento();
        cHorse.comer();
        cHorse.respirar();
    }
    
}

class Avestruz extends Animal{ //Clase avestruz que hereda de Animal


    //Métodos movimiento y comer (abstracto en clase Animal) sobreescritos
    @Override
    public void movimiento() { 
        System.out.println("Corre!!");
    }

    @Override
    public void comer() {
        System.out.println("Turistas en el serengueti");
    }
    
}

class Caballo extends Animal{ //Clase Caballo que hereda de Animal
    
    //M�todos movimiento y comer (Abstractos en clase Animal) sobreescritos
    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer");
    }
    
    //Otro método Respirar que muestra mensaje
    public void respirar(){
        System.out.println("El animal esta respirando");
    }
    
}

abstract class Animal { //Clase abstracta Animal
     //Métodos abstractos, son heredados obligatoriamente
     abstract public void movimiento();
     abstract public void comer();
}
