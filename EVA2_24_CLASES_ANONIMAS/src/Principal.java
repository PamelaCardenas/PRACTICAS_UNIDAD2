/*
 * Empleo de las clases anónimas 
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal  implements ImprimirMensaje{ //Principal adquiere los métodos de la interfaz

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objeto para Principal
        Principal pObj = new Principal();
        pObj.imprimeMensaje("Pamela"); //Imprimesión de mensaje
        
        
        //ImprimirMensaje es una interfaz. NO SE PUEDEN CREAR OBJETOS DE INTERFACES.
        //CREAR UNA INTERFAZ ANÓNIMA QUE IMPLEMENTA LOS MÉTODOS DE LA INTERFAZ
        ImprimirMensaje objImprimir = new ImprimirMensaje(){
            @Override
            public void imprimeMensaje(String sMensa) {
                System.out.println("Hola " + sMensa);
            }
            
        };
        //Se imprime mensaje llamando al objeto de la clase anónima
        objImprimir.imprimeMensaje("Karla");
        
    }

    //Método sobreescrito de ImprimeMensaje
    @Override
    public void imprimeMensaje(String sMensa) {
        System.out.println("Hola " + sMensa);
    }
    
}

//Interfaz 
interface ImprimirMensaje{
    public void imprimeMensaje(String sMensa);
}

