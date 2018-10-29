/*
 * Clase Aves que hereda los atributos de la clase Animal
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Aves extends Animal{
    //Atributos y métodos get y set
    private String accionMovimiento;
    //Nadar, correr y volar

    public String getAccionMovimiento() {
        return accionMovimiento;
    }

    public void setAccionMovimiento(String accionMovimiento) {
        this.accionMovimiento = accionMovimiento;
    }
    
    
    
}
