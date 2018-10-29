/*
 * Clase FiguraGeometrica de tipo abstracta que hereda a las subclases los métodos 
 * para calcular el area, y las coordenadas de los puntos para dibujar la figura
 */
package figuras;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
    public abstract class FiguraGeometrica {
        //ATRIBUTOS
    private String color;
    private int anchoLinea;
    public Punto esqSupIzq;

    //Métodos get y set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoLinea() {
        return anchoLinea;
    }

    public void setAnchoLinea(int anchoLinea) {
        this.anchoLinea = anchoLinea;
    }
        
    
    public Punto getEsqSupIzq() {
        return esqSupIzq;
    }

    public void setEsqSupIzq(Punto esqSupIzq) {
        this.esqSupIzq = esqSupIzq;
    }
    //AREA DE UNA FIGURA 2D
    public abstract int calcularArea();
    
    //SIMULA DIBUJAR LA FIGURA 2D
    public abstract void dibujar();
    
    
}

