/*
 * Asignación de atributos con los que cuentan las personas en general para poder heredar en otras clases
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Persona {
    //Creación de atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int estadoCivil;
    /*
    0 - SOLTERO
    1 - CASADO
    2 - DIVORCIADO
    3 - VIUDO
    */
    private String direccion;

    //Constructor de Persona
    public Persona() {
        //Asignación de los valores de los atributos de Persona
        nombre = "Pamela";
        apellido = "Cárdenas";
        edad = 24;
        estadoCivil = EstadoCivil.DIVORCIADO;
        direccion = "*******";
        
    }
    
    //Métodos get y set de cada uno de los atributos
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
