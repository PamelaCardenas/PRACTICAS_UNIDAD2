/*
 * Interfaz para representar una guitarra electrica que cuenta con dos métodos para heredar
 */ 
package mis_clases;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public interface GuitarraElectrica {
   
    //Métodos para heredar a las demás clases ligadas a esta    
    public void efectos(String tipoEfecto);
    public void amplificador(int potencia);
    
}
