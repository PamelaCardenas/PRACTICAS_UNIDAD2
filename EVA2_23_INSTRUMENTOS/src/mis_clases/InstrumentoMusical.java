/*
 * Clase abstracta para heredar métodos y atributos en las otras clases.
 * Sobre guitarras e instrumentos musicales
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
 abstract public class InstrumentoMusical {
    
    //Atributos
    private String nombre;

    //Métodos get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método abstracto que se hereda de forma obligatoria a las demás clases que heredan de esta
    abstract public void tocarInstrumento();
}
