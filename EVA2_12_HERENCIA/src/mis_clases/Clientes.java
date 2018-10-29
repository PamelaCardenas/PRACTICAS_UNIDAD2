/*
 * Clase Clientes que hereda los atributos de la clase Persona
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Clientes extends Persona{
    
    //Creación de atributo llamado RFC 
    private String RFC;

    //Métodos get y set del atributo RFC
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    
}
