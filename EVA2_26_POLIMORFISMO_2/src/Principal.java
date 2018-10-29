/*
 * Uso del Polimorfismo
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
        
        //POLIMORFISMO
        //ESTO ESTA BIEN --> PADRE = new HIJO 
        //ESTO NO ESTA BIEN --> HIJO = new PADRE
            //Alumno aAlu = new Persona();
        
        //El objeto será definido como Alumno pero se comporta como Persona
        //
        Persona pPerso = new Alumno();
        
        //Se llaman los atributos para ingresar valores
        pPerso.setNombre("Pamela");
        pPerso.setApellido("Cárdenas");
        //CASTING
        //Al objeto nuevo se le asigna el valor de pPerso pero convertido a Alumno
        Alumno aAlumno = (Alumno) pPerso; 
        //Se imprimen todos los datos de alumno
        System.out.println(aAlumno.getNombre());
        System.out.println(aAlumno.getApellido());
        System.out.println(aAlumno.getNumeroControl());
        
    }
    
}
class Empleado extends Persona{ //Empleado hereda de Persona 
    //Atributos
    private String RFC;

    //Métodos get y set
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
}

//Alumno hereda de Persona
class Alumno extends Persona{
    //Atributos
    private int numeroControl;
    
    public Alumno(){
        numeroControl = 18550338;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }
    
}

class Persona{
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
    
}


