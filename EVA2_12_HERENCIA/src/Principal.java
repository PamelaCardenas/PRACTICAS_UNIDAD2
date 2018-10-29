
import mis_clases.Clientes;
import mis_clases.Empleados;
import mis_clases.EstadoCivil;
import mis_clases.Persona;

/*
 * Solicita los datos de una persona para luego mostrarlos
 * Empleo de la herencia, usando la clase Persona como la clase padre, y las restantes como clases hijas
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
        
        Persona pObj = new Persona(); //Objeto de persona
        //Asignación de valores a los atributos de la clase persona
        /*pObj.setNombre("Pamela ");
        pObj.setApellido("Cárdenas");
        pObj.setEstadoCivil(EstadoCivil.SOLTERO);*/
        
        //Muestra los valores asignados de los atributos en la clase persona
        System.out.println("PERSONA");
        System.out.println(pObj.getNombre() + " " + pObj.getApellido() + " " + pObj.getDireccion());
        
        //Objeto de la clase Empleado
        Empleados eEmp = new Empleados();
        //Asignación de valores a los atributos de la clase Empleado
        /*eEmp.setNombre("Juan");
        eEmp.setApellido("Pérez");
        eEmp.setEstadoCivil(EstadoCivil.CASADO);
        eEmp.setSalario(1);*/
        
        //Muestra los valores asignados de los atributos de la clase Persona heredados en Empleado
        System.out.println("EMPLEADOS");
        System.out.println(eEmp.getNombre() + " " + eEmp.getApellido() + " " + eEmp.getDireccion());
        
        Clientes cCliente = new Clientes(); //Objeto para clase Clientes
        //Asignación de valores de la clase Cliente
        /*cCliente.setNombre("Pedro");
        cCliente.setRFC("RUB");*/
        
        //Muestra los valores asignados de los atributos de la clase Persona heredados en Cliente
        System.out.println("CLIENTES"); 
        System.out.println(cCliente.getNombre() + " " + cCliente.getApellido() + " " + cCliente.getDireccion());
        
    }
    
}
