/*
 * Ejemplo de como se ocupa memoria ejecutando un método que llama a otro método, y asi susecivamente, hasta que se empieza a 
 * terminar la ejecución de cada uno.
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

        //Mensaje que indica cuando comienza a ejecutarse en Main
        System.out.println("Iniciando Main");
        A(); //Se llama al método A
        System.out.println("Terminando Main"); //Se termina el método Main cuando termina el método A
    }
    
    public static void A(){ //Método A
        System.out.println("Iniciando A"); //Se ejecuta A
        B(); //Se llama al método B
        System.out.println("Terminando A"); //Se termina el método A cuando termina B
    }
    
    public static void B(){ //Método B
        System.out.println("Iniciando B"); //Se ejecuta B
        C(); //Se llama al método C
        System.out.println("Terminando B"); //Se termina el método B cuando termina C
    }
    
    public static void C(){ //Método C
        System.out.println("Iniciando C"); //Se ejecuta el método C
        System.out.println("Terminando C"); //Se termina el método C
    }
    
}
