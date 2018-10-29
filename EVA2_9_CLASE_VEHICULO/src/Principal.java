
import java.util.Scanner;
import mis_vehiculos.Vehiculo; //Importar clase Vehiculo del paquete mis_vehiculos

/*
 * Imprimir los datos para describir un automóvil, especificados en la clase Vehículo del paquete "mis_vehiculos" 
 *	MÉTODOS A LA CLASE USANDO SOLO ACELERAR Y FRENAR
 *	1.- LLEGAR A UNA VELOCIDAD INDICADA POR EL USUARIO 10 EN 10
 *	2.- DETENER EL VEHICULO --> LLEVARLO A 0 KM/H
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
        Vehiculo vCarro2 = new Vehiculo(); //Instanciar el constructor Vehiculo de la clase Vehiculo del paquete mis_vehiculos
        vCarro2.imprimirDatos(); //Imprimir valores del automóvil especificados en el constructor default de la clase vehiculo
        
        System.out.println(""); //Espacio entre líneas
        
        //Instanciar el constructor Vehiculo, de la clase vehiculo del paquete mis_Vehiculos, con los valores de los atributos definidos en esta misma clase
        Vehiculo vCarro = new Vehiculo("FORD", "F-150", 2017, 8); 
        vCarro.imprimirDatos(); //Imprimir valores del automóvil del constructor de los 4 atributos, especificados en esta clase
        
        //VERIFICAMOS SI EL AUTO ESTA ENCENDIDO
        if(!vCarro.isEstaEncendido()) { //SI NO ESTA ENCENDIDO
            vCarro.prender(); //LO ARRANCAMOS
        }
        
        //Preguntar al usuario el límite de velocidad
        System.out.println("¿Hasta que velocidad desea llegar?");
        int velMax = s.nextInt(); //Límite de velocidad 
        
        
        if (velMax<0){ //Si el límite de velocidad es menor a 0
            System.out.println("ERROR"); //Es un error
        }
        
        if (vCarro.getVelocidad() > velMax){ //Si la velocidad es mayor al límite 
            while (vCarro.getVelocidad()!= velMax){ //El ciclo se ejecuta hasta que la velocidad actual sea igual al límite
                vCarro.frenar(); //Desacelerar de 10 en 10
                System.out.println("Velocidad actual = " + vCarro.getVelocidad()); //Mostrar velocidad
            }
        }
        
        if (vCarro.getVelocidad() >= 0 && vCarro.getVelocidad() < velMax) { //Si la velocidad en la que va es mayor o igual a 0 y menor al límite
        while (vCarro.getVelocidad()!= velMax){ //El ciclo va a ejecutarse hasta que la velocidad sea igual al límite
                vCarro.acelerar(); //Acelerar de 10 en 10
        }
        System.out.println("Velocidad = " + vCarro.getVelocidad());} //Muestra la velocidad actual
        
        
        if (vCarro.getVelocidad() == velMax){ //Si la velocidad actual es igual al límite
          while(vCarro.getVelocidad() != 0){ //El ciclo se va a ejecutar hasta que la velocidad sea igual a 0
            vCarro.frenar(); //Disminuir la velocidad de 10 en 10
            
            System.out.println("Velocidad " + vCarro.getVelocidad()); //Muestra la velocidad actual
        }  
        }
        
        if (vCarro.isEstaEncendido() && vCarro.getVelocidad()== 0) { //Si el auto esta encendido y la velocidad es igual a 0
            vCarro.apagar(); //Se apaga
        }
        
        System.out.println("Velocidad = " + vCarro.getVelocidad()); //Muestra la velocidad actual
        
        }
        
        
        
    }
