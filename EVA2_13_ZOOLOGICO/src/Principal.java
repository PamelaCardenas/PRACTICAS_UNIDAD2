
import mis_clases.Animal;
import mis_clases.Aves;
import mis_clases.Mamiferos;
import mis_clases.Reproduccion;
import mis_clases.Reptiles;
import mis_clases.TipoPiel;
import mis_clases.mueven;

/*
 * Uso de la herencia entre diversas clases, como ejemplo mostrando mensajes de clases de animales.
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
        //Creación de objetos de las clases
        Animal aAni = new Animal();
        Aves aAv = new Aves();
        Mamiferos mMamifero = new Mamiferos();
        Reptiles rRep = new Reptiles();
        
        //Introducción de datos para Aves
        aAv.setOjos(2);
        aAv.setExtremidades(2);
        aAv.setMueven(mueven.VUELAN);
        aAv.setReproduccion(0);
        aAv.setTipoPiel(TipoPiel.PLUMAS);
        aAv.setAccionMovimiento("Volar");
        
        //Mostrar las valores de Aves
        System.out.println("Aves: " +" Ojos: "+ aAv.getOjos() +", Extremidades: " + aAv.getExtremidades() + ", Movimiento: " + aAv.getMueven() 
                + ", Reproducción: " + aAv.getReproduccion() + ", Piel: " + aAv.getTipoPiel() + ", Manera en que se mueve: " + aAv.getAccionMovimiento());
        
        //Introducción de datos para Mamiferos
        mMamifero.setOjos(2);
        mMamifero.setExtremidades(4);
        mMamifero.setMueven(mueven.CAMINAN);
        mMamifero.setReproduccion(Reproduccion.VIVIPAROS);
        mMamifero.setTipoPiel(TipoPiel.PELO);
        mMamifero.setTipoMamifero("Placentarios");
        
        //Mostrar las valores de Aves
        System.out.println("Mamíferos: " +" Ojos: "+ mMamifero.getOjos() +", Extremidades: " + mMamifero.getExtremidades() + ", Movimiento: " + mMamifero.getMueven() 
                + ", Reproducción: " + mMamifero.getReproduccion() + ", Piel: " + mMamifero.getTipoPiel() + ", Piel: " + mMamifero.getTipoMamifero());
        
        //Introducción de datos para Reptiles
        rRep.setOjos(2);
        rRep.setExtremidades(4);
        rRep.setMueven(mueven.ARRASTRAN);
        rRep.setReproduccion(Reproduccion.OVIPAROS);
        rRep.setTipoPiel(TipoPiel.ESCAMAS);
        rRep.setAlimentacion("Carnivoros");
        
        //Mostrar las valores de Aves
        System.out.println("Reptil: " + rRep.getOjos() +", Extremidades: " + rRep.getExtremidades() + ", Movimiento: " + rRep.getMueven() 
                + ", Reproducción: " + rRep.getReproduccion() + ", Piel: " + rRep.getTipoPiel() + ", " + rRep.getAlimentacion());
    }
    
}
