/*
 * Uso del polimorfismo empleando diferentes clases y la herencia
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
        
        //Objeto para la clase Empleado
        Empleado eEmp = new Empleado();
        //Guarda los datos ingresados en los atributos de la clase Empleado y los heredados de Persona
        eEmp.setNombre("Juan");
        eEmp.setApellido("Perez");
        eEmp.setRfc("12231DBS");
         
        //Objeto de la clase Alumno
        Alumno aAlu = new Alumno();
        //Guarda los datos ingresados en los atributos de la clase Alumno y los heredados de Persona
        aAlu.setNombre("Pedro");
        aAlu.setApellido("Picapiedra");
        aAlu.setNumeroControl("00112233");
        
        /*Imprime los datos de las clases usando el método ImprimirDatos para 
        poder crear un objeto de Persona y usar sus atributos, ya que al ser una clase 
        abstracta no se puede instanciar */
        imprmirDatos(eEmp);
        imprmirDatos(aAlu);
        
    }
    //Método para llamar los atributos de la clase Persona, sin instanciarlo
    public static void imprmirDatos(Persona pPerso){
        pPerso.imprimirNombre();
    }
    
}


