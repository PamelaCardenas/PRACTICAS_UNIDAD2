/*
 * Clase Mamiferos que hereda los atributos de la clase Animal
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Mamiferos extends Animal{
    
    //Creación del atributo de la clase
    private String tipoMamifero;
    //Placentarios, marsupiales y monotremas
    
    
    //Métodos get y set de tipoMamifero

    public String getTipoMamifero() {
        return tipoMamifero;
    }

    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }
    
    
}
