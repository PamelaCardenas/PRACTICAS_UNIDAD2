/*
 * Clase Alumno que hereda los m�todos de la clase Persona
 */

/**
 *
 * @author Karla Pamela C�rdenas Leyva 18550338
 */
public class Alumno extends Persona{
    //Atributos
    private String numeroControl;

    //M�todos get y set
    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    //M�todos sobreescrito que muestra un mensaje con el nombre, apellido y el numero de control del alumno
    @Override
    public void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " + getNumeroControl() );
    }
    
}
