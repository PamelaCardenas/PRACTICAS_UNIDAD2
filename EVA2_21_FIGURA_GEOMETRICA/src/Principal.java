/*
 * Dibujar figuras geométricas mostrando las coordenadas de los 
 * puntos en los que se encuentran.
 */
import figuras.*;
import java.util.Scanner;
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

        //Objetos de las clases y Scanner
        Punto p = new Punto();
        Scanner s = new Scanner(System.in);
        Circulo circ = new Circulo();
        Rectangulo rec = new Rectangulo();
        int op;
        
        do{
        //Muestra menú para seleccionar la figura que desee dibujar
        System.out.println("Elige una opción: "
                            + "\n1) Rectangulo"
                            + "\n2) Círculo"
                            + "\n3) Salir");
        op = s.nextInt(); //Se guarda la respuesta del usuario
        
        //Sentencia switch para cada una de las respuestas
        switch(op){
            case 1:
                
                //Solicita la base del rectángulo
                System.out.println("Ingrese la base del Rectangulo");
                int iBase = s.nextInt();
                
                //Solicita la altura
                System.out.println("Ingrese la altura del Rectangulo");
                int iAltura = s.nextInt();
                
                //Solicita las coordenadas del primer punto (Esquina superior Izquierda) en X y Y
                System.out.println("Ingrese las coordenadas en X");
                p.setX(s.nextInt());
                System.out.println("Ingrese las coordenadas en Y");
                p.setY(s.nextInt());
                
               //Se guardan los datos solicitados
                rec.setEsqSupIzq(p);
                rec.setBase(iBase);
                rec.setAltura(iAltura);
                //Se muestra el método Dibujar para mostrar las coordenadas de los puntos
                rec.dibujar();
                 
                //Muestra el área del rectángulo
                System.out.println("\nArea = " + rec.calcularArea());
                break;
                
                case 2:
                
                //Solicita el radio del circulo
                System.out.println("Ingrese el radio del circulo");
                int rRadio = s.nextInt();
                
                
                //Solicita las coordenadas del primer punto (Esquina superior Izquierda) en X y Y
                System.out.println("Ingrese las coordenadas en X");
                p.setX(s.nextInt());
                System.out.println("Ingrese las coordenadas en Y");
                p.setY(s.nextInt());
                
               //Se guardan los datos solicitados
                circ.setEsqSupIzq(p);
                circ.setRadio(rRadio);
                //Se muestra el método Dibujar para mostrar las coordenadas de los puntos
                circ.dibujar();
                 
                //Muestra el área del circulo
                System.out.println("\nArea = " + circ.calcularArea());
                break;
                
                //Al seleccionar la opcion tres el programa termina
                case 3:
                System.out.println("Has salido del programa, nos vemos!!");
                break;
                
                //Si ignresa cualquier otro numero da un mensaje y pide una nueva opcion
                default: System.out.println("Opción no válida");
                
        }
        }while (op != 3); //El programa se ejecuta hasta que la opcion sea 3
        
    } 
     
}
