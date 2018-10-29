/*
 * Clase abstracta Persona que es la clase Padre de Alumno y Empleado, guarda los métodos y atributos 
 * utilizados en las otras clases
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
abstract public class Persona {
    //Atributos
    private String nombre;
    private String apellido;

    //Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Método abstracto obligatorio para heredar en las clases hijas
    abstract public void imprimirNombre();
}
