/*
 * Clase Alumno que hereda los métodos de la clase Persona
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Alumno extends Persona{
    //Atributos
    private String numeroControl;

    //Métodos get y set
    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    //Métodos sobreescrito que muestra un mensaje con el nombre, apellido y el numero de control del alumno
    @Override
    public void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " + getNumeroControl() );
    }
    
}
