/*
 * Clase Empleados que hereda los atributos de Persona
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Empleados extends Persona{ //La clase Empleados se extiende de Persona obteniendo sus atributos

    //Creación de un atributo llamado Salario
    private double salario;

    //Métodos get y set del atibuto Salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
