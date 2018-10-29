/*
 * Se mandan llamar dos objetos creados de la misma clase, mostrando las distintas formas de dar de alta sus atributos, 
 * así como ser mostrados llamando a su respectivo método get
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 1855038
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco bMiCuenta = new Banco();   //Objeto para inicializar la clase banco 

        //Se muestran los valores de las variables en la clase Banco
        System.out.println("Nombre del Cliente: "+ bMiCuenta.getNombreCliente());  //Mostrar el nombre del cliente usando el método getNombreCliente
        System.out.println("Saldo del Cliente: " + bMiCuenta.getSaldo()); //Mostrar el saldo del cliente usando el método getSaldo
        
        System.out.println(" "); //Se muestra un espacio entre los textos

        //Se crea nuevo objeto de la clase banco con los atributos indicados al inicializarlo
        Banco bMiCuenta2 = new Banco("Karla Cárdenas", 50000); 
        
        System.out.println("Nombre Cliente: " + bMiCuenta2.getNombreCliente()); //Se muestra el nombre del cliente que se asigno al crear el segundo objeto
        System.out.println("Saldo del Cliente: "+ bMiCuenta2.getSaldo()); //Se muestra el saldo del cliente asignado al crear el segundo objeto
    }
    
}

//Mismos métodos con diferetes argumentos se le llama Sobre Carga

//Clase llamada Banco
class Banco{ 
    private String nombreCliente; //Atributo del nombre de tipo String el cual es privado
    private double saldo; //Atributo saldo de tipo double el cual es privado

    //Se crea Constructor default
    public Banco() {
        //Se asignan los valores de los atributos
        nombreCliente = "Pamela Cárdenas"; 
        saldo = 10000;
    }

    //Nuevo Constructor Banco, estableciendo los atributos
    public Banco(String nombreCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    //Respectivos métodos get y set de cada uno de los atributos
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}