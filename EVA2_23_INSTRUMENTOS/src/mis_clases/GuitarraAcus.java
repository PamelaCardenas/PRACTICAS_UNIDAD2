/*
 * Clase que hereda métodos de la clase Padre, y de una interfaz, así 
 * como algunos atributos
 */
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */

//GuitarraAcus hereda de InstrumentoMusical y de la interfaz GuitarraAcustica
public class GuitarraAcus extends InstrumentoMusical implements  GuitarraAcustica{
    
  //Atributos
  private int numeroCuerdas;
  private String tipoCuerdas;
  private String tipoGuitarra;
    
    //Métodos get y set
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    

     //Método sobreescrito tocarInstrumento de la clase  InstrumentoMusical
    @Override
    public void tocarInstrumento() {
       //Muestra los mensajes con la información solicitada en la clase  Principal
        System.out.println("Rascale!!, Guitarra con " + numeroCuerdas);
        System.out.println("La guitarra es de tipo " + getNombre());
        System.out.println("Material de las cuerdas "+ tipoCuerdas);
        System.out.println("Tipo de Guitarra "+ tipoGuitarra);
        
    }

    //Método sobreescrito de la interfaz GuitarraAcustica
    @Override
    public void materialCuerdas(String maCuerdas) {
        this.tipoCuerdas = maCuerdas;
    }

    //Método sobreescrito de la interfaz GuitarraAcustica
    @Override
    public void tipoGuitarra(String tipoGuit) {
        this.tipoGuitarra = tipoGuit;
        
    }

    
    
    

    
}
