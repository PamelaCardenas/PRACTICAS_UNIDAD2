/*
 * Clase animal con las caracteristicas generales de los animales en atributos
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Animal {
    //atributos
    private int ojos;
    private int extremidades;
    private int mueven;
    /*
    0 - CAMINAN
    1 - VUELAN
    2 - ARRASTRAN
    */
    private int reproduccion;
    /*
    0 - OVÍPAROS
    1 - VIVÍPAROS
    */
    private int tipoPiel;
    /*
    0 - PELO
    1 - ESCAMAS
    2 - PLUMAS
    */

    
    //Métodos get y set
    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public int getMueven() {
        return mueven;
    }

    public void setMueven(int mueven) {
        this.mueven = mueven;
    }

    public int getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(int reproduccion) {
        this.reproduccion = reproduccion;
    }

    public int getTipoPiel() {
        return tipoPiel;
    }

    public void setTipoPiel(int tipoPiel) {
        this.tipoPiel = tipoPiel;
    }
    
    
    
}
