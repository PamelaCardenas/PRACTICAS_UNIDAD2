/*
 * Calcula los puntos en donde se encuentra el Círculo y el área
 */ 
package figuras;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */

//Clase Circulo hereda los métodos de FiguraGeometrica
public class Circulo extends FiguraGeometrica {
    
    //Atributo para el radio
    private int radio;
    
    //Métodos get y set

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //Método para calcular el area del circulo
    @Override
    public int calcularArea() {
        return (int) (Math.PI*(Math.pow(radio, 2)));
    }

    //Método para mostrar las coordenadas de los puntos por los que pasa el circulo
    @Override
    public void dibujar() {
        
        //Variables
        Punto der, arriba, abajo, centro;
        
        //Objeto de las variables
        der = new Punto();
        arriba = new Punto();
        abajo = new Punto();
        centro = new Punto();
        
        //Calcular el punto de la derecha de acuerdo a X y Y
        der.setX(getEsqSupIzq().getX() + (radio*2));
        der.setY(getEsqSupIzq().getY());
        
        //Calcular el punto de arriba de acuerdo a X y Y
        arriba.setX(getEsqSupIzq().getX() + radio);
        arriba.setY(getEsqSupIzq().getY() + radio);
        
        //Calcular el punto de abajo de acuerdo a X y Y
        abajo.setX(getEsqSupIzq().getX() - radio);
        abajo.setY(getEsqSupIzq().getY() - radio);
        
        //Calcular el punto del centro de acuerdo a X y Y
        centro.setX(getEsqSupIzq().getX() + radio);
        centro.setY(getEsqSupIzq().getY());
        
        //Muestra las coordenadas de cada uno de los puntos
        System.out.println("Punto del centro: (" + centro.getX() + "," + centro.getY() + ")");
        System.out.println("Punto de la izquierda: (" + getEsqSupIzq().getX() + "," + getEsqSupIzq().getY() + ")");
        System.out.println("Punto de arriba: (" + arriba.getX() + "," + arriba.getY() + ")");
        System.out.println("Punto de la derecha: (" + der.getX() + "," + der.getY() + ")");
        System.out.println("Punto de abajo: (" + abajo.getX() + "," + abajo.getY() + ")");
        
    }
    
    

    
 
}
