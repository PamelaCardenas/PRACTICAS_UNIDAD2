/*
 * Uso del polimorfismo incluyendo el override (Sobreescripción de métodos)
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

        //Objeto de Doctor
        Doctor dSimi = new Doctor();
        dSimi.tratarPaciente(); //Muestra método de doctor
        //Objeto de Cirujano
        Cirujano cStrange = new Cirujano();
        //Muestra métodos de Doctor y Cirujano
        cStrange.tratarPaciente();
        cStrange.cobrar();
        //Objeto de Cirujano pero que se comporta como Doctor
        Doctor dChapatin = new Cirujano();
        dChapatin.tratarPaciente(); //Solo método de Doctor
        //Objeto Cirujano que convierte el antiguo método Doctor en Cirujano
        Cirujano cHouse = (Cirujano)dChapatin;
        cHouse.cobrar(); //Método de Cirujano
    }
    
}

class Cirujano extends Doctor{ //Cirujano hereda de Doctor
    //Método exclusivo de Cirujano que muestra un mensaje 
    public void cobrar(){
        System.out.println("Harta lana!!");
    }
    
    //Método sobreescrito de la clase Doctor que muestra un  nuevo mensaje
    @Override
    public void tratarPaciente() {
        System.out.println("Cirugía a corazón abierto");
    }
    
}

class Doctor{
    public void tratarPaciente(){ //Método que despliega un mensaje
        System.out.println("Paracetamol");
    }
}
