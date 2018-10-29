
import mis_clases.*;

/*
 * POLIMORFISMO:
 * Relacionada con la herencia
 * Es cuando un objeto de una clase se comporta como objeto  de otra clase.
 * Clases esten relacionadas por HERENCIA
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
        
        //Creación de los objetos de las clases
        Automovil aTsuru = new Automovil();
        Motocicleta mHarley = new Motocicleta();
        Avion aBoeing = new Avion();
        
        //Se solicitan los métodos de Automovil, se ingresan los valores y se muestran
        aTsuru.seguridad();
        aTsuru.setRuedas(4);
        imprimirRuedas(aTsuru);
        
        //Se solicitan los métodos de Motocicleta, se ingresan los valores y se muestran
        mHarley.chopper();
        mHarley.setRuedas(2);
        imprimirRuedas(mHarley);
        
        //Se solicitan los métodos de Avión, se ingresan los valores y se muestran
        aBoeing.movimiento();
        aBoeing.setRuedas(24);
        imprimirRuedas(aBoeing);
    }
    
    //Método que recibe argumentos de vehiculo
    public static void imprimirRuedas(Vehiculo arg){
        String sTipoVehi; //Variable
        if (arg instanceof Automovil){ //Si el argumento es de la clase Automovil
            sTipoVehi = "Automovil"; //Tipo de vehiculo será un Automovil
        }
        else if (arg instanceof Motocicleta){ //Si el argumentos es de la clase Motocicleta
            sTipoVehi = "Motocicleta"; //El tipo de vehiculo será Motocicleta
        }
        else {
            sTipoVehi = "Avion"; //Si no es ninguno de esos dos entonces será un Avión
        }
        //Imprime mensaje mostrando el tpo de vehiculo y la cantidad de ruedas que tiene
        System.out.println("Ruedas del " + sTipoVehi + ":"+ arg.getRuedas());
        
        //SI ES UN AUTOMOVIL, IMPRIMIR LA SEGURIDAD
        if(arg instanceof Motocicleta){
            //CONVERTIR VEHICULO A AUTOMOVIL
            Automovil aAuto = (Automovil)arg;
            aAuto.seguridad();
        }
    }
    
}


