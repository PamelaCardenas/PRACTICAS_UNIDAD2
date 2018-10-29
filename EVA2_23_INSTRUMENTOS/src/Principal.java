
import mis_clases.Guitarra;

/*
 * Solicita toda la información para usarla en los métodos de las otras clases
 * y muestra el método tocarInstrumento de la clase Guitarra
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
        //Objeto de la clase Guitarra
        Guitarra gMiGuitarra = new Guitarra();
        
        //Solicita la información de los atributos y métodos
        gMiGuitarra.setNombre("Gibson");
        gMiGuitarra.setNumeroCuerdas(6);
        gMiGuitarra.efectos("Wah");
        gMiGuitarra.amplificador(1000);
        //Muestra el método tocarInstrumento de guitarra
        gMiGuitarra.tocarInstrumento();
    }
    
}
