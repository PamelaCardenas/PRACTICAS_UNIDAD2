/*
 * Práctica que muestra el uso de los métodos que se sobreescriben 
 * de la clase Padre a las clases Hijos
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
        
        //Creación de objetos de las clases 
        Animal aAni = new Animal();
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero ("Pararse");
    }
    
}

//Clase mamifero que hereda los atributos y métodos de la clase Animal
class Mamifero extends Animal {  //------> Clase hijo, subclase
   //Constructor de Mamifero
    public Mamifero() {
        //LO PRIMERO ES LLAMAR AL CONSTRUCTOR DE LA BASE
        
        super(); //Se usa para llamar al método de la clase Padre
        
    }

    //Nuevo constructor con un atribuo String
    public Mamifero(String accion){
        super(accion); //Llama al método de la clase Padre
        System.out.println("Y salir corriendo"); //Imprime mensaje
    }

}
class Animal {  //------> Clase base, clase padre

    //Cosntructor de la clase Animal
    public Animal(){
        System.out.println("Respirando"); //Imprime mensaje
    }  

    //Constructor de la clase Animal con atributo String
    public Animal(String accion){
        System.out.println("Respirar y " + accion); //Imprime mensaje con la variable acción
    }
}


//Java solo permite herencia simple (pero simula herencia múltiple)
//TODAS LAS CLASES DESCIENDEN DE LA CLASE Object