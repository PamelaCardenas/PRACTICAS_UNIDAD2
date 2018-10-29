/*
 * Clase que hereda m�todos de la clase Padre, y de una interfaz, as� 
 * como algunos atributos
 */
package mis_clases;

/**
 *
 * @author Karla Pamela C�rdenas Leyva 18550338
 */

//GuitarraAcus hereda de InstrumentoMusical y de la interfaz GuitarraAcustica
public class GuitarraAcus extends InstrumentoMusical implements  GuitarraAcustica{
    
  //Atributos
  private int numeroCuerdas;
  private String tipoCuerdas;
  private String tipoGuitarra;
    
    //M�todos get y set
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    

     //M�todo sobreescrito tocarInstrumento de la clase  InstrumentoMusical
    @Override
    public void tocarInstrumento() {
       //Muestra los mensajes con la informaci�n solicitada en la clase  Principal
        System.out.println("Rascale!!, Guitarra con " + numeroCuerdas);
        System.out.println("La guitarra es de tipo " + getNombre());
        System.out.println("Material de las cuerdas "+ tipoCuerdas);
        System.out.println("Tipo de Guitarra "+ tipoGuitarra);
        
    }

    //M�todo sobreescrito de la interfaz GuitarraAcustica
    @Override
    public void materialCuerdas(String maCuerdas) {
        this.tipoCuerdas = maCuerdas;
    }

    //M�todo sobreescrito de la interfaz GuitarraAcustica
    @Override
    public void tipoGuitarra(String tipoGuit) {
        this.tipoGuitarra = tipoGuit;
        
    }

    
    
    

    
}
