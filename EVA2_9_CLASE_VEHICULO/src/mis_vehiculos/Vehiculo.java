/*
 * Clase para dar de alta los atributos principales de un automovil, incluyendo dos constructores para agregar los valores por default, y otro 
 * ingresados desde la clase principal, describiendo dicho automovil.
 * Hacer un pequeña simulación de un automóvil, para encenderlo, apagarlo, acelerar y frenar.
 */
package mis_vehiculos;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Vehiculo {
    //AGREGAR ATRIBUTOS, DE ACCESO PRIVADO
    //Atributos para describir el automóvil
    private String modelo, marca;
    private int año, cilindros;
    //Atributos para simular un automóvil
    private boolean estaEncendido;
    static int velocidad;
    
    
    //AGREGAR CONSTRUCTOR DEFAULT, PONER VALORES A SU GUSTO
    
    public Vehiculo() {
        modelo = "Ford";
        marca = "Fiesta";
        año = 2008;
        cilindros = 1;
        
    }
    //AGREGAR CONSTRUCTOR QUE ACEPTE LOS 4 ATRIBUTOS
    
    public Vehiculo(String modelo, String marca, int año, int cilindros) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.cilindros = cilindros;
        estaEncendido = false;
        velocidad = 0;
    }
    
    //EL CONSTRUCTOR DEFAULT ES CASI CASI A FUERZA
    //MÉTODOS GET Y SET PARA CADA ATRIBUTO

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int getCilindros(){
        return cilindros;
    }
    
    public void setCilindros(int cilindros){
        this.cilindros = cilindros;
    }
    
    //IMPRIMIR LOS DATOS DEL VEHICULO
    public void imprimirDatos(){
        System.out.println("TU VEHICULO ES: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Cilindros: " + cilindros);
    }
    //Método para encender el automóvil
    public void prender(){
        estaEncendido = true;
    }
    //Método para apagar el automóvil
    public void apagar() {
        estaEncendido = false;
    }
    //Método para hacer avanzar el automóvil, revisando primero si esta encendido o apagado
    public void acelerar() {
        if (estaEncendido){
                velocidad = velocidad + 10;
            
        }
    }
    //Método para hacer frenar el automóvil, revisando primero si esta encendido o apagado
    public void frenar(){
        if (estaEncendido){
            if(velocidad >= 10) {
              
                velocidad = velocidad - 10;
  
            }
        }
    }
    //Método get y set para la variable Velocidad
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
    
    
    
    
    
}
