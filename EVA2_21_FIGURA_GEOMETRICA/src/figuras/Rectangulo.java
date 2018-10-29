/*
 * Clase para calcular las coordenadas de un Rectángulo, así como el área
 */
package figuras;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */

//Rectángulo hereda los métodos de FiguraGeométrica
public class Rectangulo extends FiguraGeometrica{ 
    
    //Atributos
    private int base, altura;

    //Métodos get y set de los atributos
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

   //Método sobreescrito para calcular el área
    @Override
    public int calcularArea() {
        return base*altura;
    }

    //Método sobreescrito para Dibujar el rectángulo (Muestra las coordenadas de los puntos)
    @Override
    public void dibujar() {

        //Variables
        Punto esqInfIzq, esqSupDer, esqInfDer;
        
        //Objeto de las variables
        esqInfIzq = new Punto();
        esqSupDer = new Punto();
        esqInfDer = new Punto();
        
        //Calcular el punto inferior izquierdo de acuerdo a X y Y
        esqInfIzq.setX(getEsqSupIzq().getX());
        esqInfIzq.setY(getEsqSupIzq().getY() - altura);
        
        //Calcular el punto inferior Derecho de acuerdo a X y Y
        esqInfDer.setX(getEsqSupIzq().getX() + base);
        esqInfDer.setY(getEsqSupIzq().getY() - altura);
        
        //Calcular el punto Superior Derecho de acuerdo a X y Y
        esqSupDer.setX(getEsqSupIzq().getX() + base);
        esqSupDer.setY(getEsqSupIzq().getY());
        
        //Muestra las coordenadas de cada uno de los puntos
        System.out.println("Punto de la esquina superior izquierda: (" + getEsqSupIzq().getX() + "," + getEsqSupIzq().getY() + ")");
        System.out.println("Punto de la esquina inferior izquierda: (" + esqInfIzq.getX() + "," + esqInfIzq.getY() + ")");
        System.out.println("Punto de la esquina superior derecha: (" + esqSupDer.getX() + "," + esqSupDer.getY() + ")");
        System.out.println("Punto de la esquina inferior derecha: (" + esqInfDer.getX() + "," + esqInfDer.getY() + ")");
    }
    
    
}
