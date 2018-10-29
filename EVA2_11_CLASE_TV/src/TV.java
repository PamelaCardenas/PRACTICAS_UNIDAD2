/*
 * Simulador de un control remoto para TV, con las funciones de prender, apagar, cambiar de canal, subir o bajar volumen y silenciar
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class TV {
    
    //Creación de los atributos
    boolean estaEncendida;
    int volumen;
    int canal;
    int anteriorCanal;
    int auxCanal;
    boolean mute;
    int volumenActual;
    
    //Constructor
    public TV(){
        //Asignación de los valores de los atributos
        estaEncendida = false;
        volumen = 0;
        canal = 1;
        mute = false;
        volumenActual = 0;
        anteriorCanal = 0;
        auxCanal = 0;
    }
    
    //Métodos get y set de canal
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    
    //Método boolean para prender la TV
    public void prender(){
        estaEncendida = true; //Indica que en este método la variable estaEncendida será true
    }
    //Método boolean para apagar la TV
    public void apagar(){ 
        estaEncendida = false; //Indica que en este método la variable estaEncendida será false
    }
    
    public void cambiarCanalSiguiente(){ //Método para cambiar de canal
        if (estaEncendida) { //Si esta encendida es igual a true (Prendida)
            canal = canal + 1; //Se crea un acumulador, canal guarda el valor de canal más 1 cada vez que se llame al método
            if (canal > 999) { //Si el canal llega a ser mayor a 999
                canal = 999; //El canal tomará el valor de 999
            }
            anteriorCanal = canal; //La variable anteriorCanal guarda el valor de canal
        }
    }
    
    public void cambiarCanalAnterior(){ //Método para cambiar al canal anterior
        if(estaEncendida){ //Si esta encendida es igual a true (Prendida)
            canal = canal - 1; //Se crea un acumulador, canal guarda el valor de canal menos 1 cada vez que se llame al método
            if(canal < 1) { //Si el canal llega a ser menor a uno
                canal = 1; //El canal tendrá el valor de 1
            }
            anteriorCanal = canal; //La variable anteriorCanal guarda el valor de canal
        }
    }
    
    public void regresarCanalAnterior(){ //Método para volver al canal en el que se encontraba antes
        if (estaEncendida){ //Si esta encendida es igual a true (Prendida)
             auxCanal = anteriorCanal; //La variable auxCanal guarda el valor del canal anterior
             canal = auxCanal; //Canal toma el valor del auxCanal
        }
    }
    
    public void subirVolumen(){ //Método para subir el volumen
        if(estaEncendida){ //Si esta encendida es igual a true (Prendida)
            volumen = volumen + 1; //Se crea un acumulador, volumen guarda el valor de volumen más 1 cada vez que se llame al método
            if(volumen > 100){ //Si el volumen llega a ser mayor a 100
                volumen = 100; //El volumen será igual a 100
            }
        }
    }
    
    public void bajarVolumen() { //Método para bajar el volumen
        if (estaEncendida){ //Si esta encendida es igual a true (Prendida)
            volumen = volumen - 1; //Se crea un acumulador, volumen guarda el valor de volumen menos 1 cada vez que se llame al método
            if(volumen < 0){ //Si el volumen llega a ser menor a 0
            volumen = 0; //El volumen será igual a 0
            }
        }
    }
    
    public void activarMute(){ //Método para activar el silenciador en la TV
        if(estaEncendida){ //Si esta encendida es igual a true (Prendida)
            if(mute == false){ //Si al llamarse el método el mute esta desactivado 
                mute = true; //La variable mute se vuelve true (Se activa el mute)
                volumenActual = volumen; //La variable volumenActual guarda el valor del volumen en el que se encontraba
                volumen = 0; //El volumen se vuelve 0
            }
        }
    }
    
    public void quitarMute() { //Método para desactivar el mute
        if(estaEncendida){ //Si esta encendida es igual a true (Prendida)
            if(mute == true){ //Si al llamarse el método el mute esta activado 
                mute = false; //La variable mute se vuelve false (Se desactiva el mute)
                volumen = volumenActual; //la variable volumen toma el valor en el que se encontraba antes de activar el mute   
            }
        }
    }
    
}
