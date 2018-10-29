
import java.util.Scanner;

/*
 * Simulador de control remoto de una TV
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
        Scanner s = new Scanner(System.in);
        TV tele = new TV();
        
        if (!tele.estaEncendida){
            tele.prender();
        }
        
        tele.setCanal(s.nextInt()); //Ingresar canal
        
        tele.cambiarCanalSiguiente(); //Cambiar al siguiente canal
        
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        tele.cambiarCanalAnterior(); //Cambiar al canal anterior
        
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        tele.setCanal(s.nextInt()); //Ingresar nuevo canal
        
        tele.regresarCanalAnterior(); //Regresar al canal anterior
        
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        tele.setCanal(s.nextInt()); //Ingresa nuevo canal
        
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        tele.cambiarCanalSiguiente(); //Cambiar al siguiente canal
         
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        tele.regresarCanalAnterior(); //Regresar al canal anterior
        
        System.out.println("Canal = " + tele.getCanal()); //Mostrar canal actual
        
        
        
    }
    
}
