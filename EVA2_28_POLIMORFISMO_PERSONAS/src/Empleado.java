/*
 * Clase Empleado que hereda los métodos de la clase Persona
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Empleado extends Persona{
    //Atributos
    private String rfc;

    //Métodos get y set
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    ///Método sobreescrito en el que imprime el nombre, apellido y el RFC del empleado
    @Override
    public void imprimirNombre() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " " + getRfc());
    }
    
}
