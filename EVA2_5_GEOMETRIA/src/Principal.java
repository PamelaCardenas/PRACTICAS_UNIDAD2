/*
 * Mostrar las distintas areas de diversas figuras geometricas dando valores por defecto
 */
import static java.lang.Math.PI; //Llamar a la paqueteria para utilizar el valor de PI como estático
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
        
        //Mostrar las diferentes áreas de cada una de las figuras indicadas llamando el Método de la clase Geometría
        //Area de un cuadrado
        System.out.println("Area de un cuadrado de lado 100 = "+ Geometria.calculaAreaCuadrado(100));
        //Area de un Triángulo
        System.out.println("Area de un Triangulo de base 5 y altura 7 = "+ Geometria.calculaAreaTriangulo(5, 7));
        //Area de un Rectangulo
        System.out.println("Area de un Rectangulo de base 8 y altura 6 = " + Geometria.calculaAreaRectangulo(8, 6));
        //Area de un Rombo
        System.out.println("Area de un Rombo con diagonal mayor de 10 y diagonal menor de 6 = " + Geometria.calculaAreaRombo(10, 6));
        //Area de un Trapecio
        System.out.println("Area de un Trapecio con base Mayor 8, base menor 6 y altura de 5 = " + Geometria.calculaAreaTrapecio(8, 6, 5));
        //Area de un polígono Regular
        System.out.println("Area de un Polígono Regular con perimetro de 30 y apotema de 5 = " + Geometria.calculaAreaPoligonoReg(30, 5));
        //Area de un Círculo 
        System.out.println("Area de un Circulo con radio de 8 = " + Geometria.calculaAreaCirculo(PI, 8));
        //Area de un Romboide
        System.out.println("Area de un Romboide con base 9 y altura 7 = " + Geometria.calculaAreaRomboide(9, 7));
        //Area de un Cubo
        System.out.println("Area de un Cubo con lado de 20 = " + Geometria.calculaAreaCubo(20));
        //Area de una Esfera
        System.out.println("Area de una Esfera con radio de 15 = " + Geometria.calculaAreaEsfera(15, PI));
    }
    
}


class Geometria{
    /*Los métodos estáticos existen desde que el programa inicia, y solamente se pueden usar a través 
    de la clase a la que pertenecen. NO SON INSTANCIABLES*/
    
    //CONSTATNTE ESTÁTICA DOUBLE LLAMADA PI
    static final double PI = 3.14159;
    
    //Método estático para calcular el area de un cuadrado
    public static double calculaAreaCuadrado(double dLado){
        return dLado*dLado;
    }
    //Método estático para calcular el area de un Triangulo
    public static double calculaAreaTriangulo(double baseTri, double alTri){
        return (baseTri*alTri)/2;
    }
    //Método estático para calcular el area de un Rectangulo
    public static double calculaAreaRectangulo(double baseRec, double alRec){
        return (baseRec*alRec);
    }
    //Método estático para calcular el area de un Rombo
    public static double calculaAreaRombo(double diaMay, double diaMen){
        return (diaMay*diaMen)/2;
    }
    //Método estático para calcular el area de un Trapecio
    public static double calculaAreaTrapecio(double baseMayTrap, double baseMenTRap, double alTrap){
        return ((baseMayTrap+baseMenTRap)/2)*alTrap;
    }
    //Método estático para calcular el area de un Poligono Regular
    public static double calculaAreaPoligonoReg(double perimetroPol, double apotemaPol){
        return (perimetroPol*apotemaPol)/2;
    }
    //Método estático para calcular el area de un Circulo
    public static double calculaAreaCirculo(double PI, double radioCir){
        return (PI*(Math.pow(radioCir, 2)));
    }
    //Método estático para calcular el area de un Romboide
    public static double calculaAreaRomboide(double baseRom, double altRom) {
        return baseRom*altRom;
    }
    //Método estático para calcular el area de un Cubo
    public static double calculaAreaCubo (double ladoCubo) {
        return 6*(Math.pow(ladoCubo, 2));
    }
    //Método estático para calcular el area de una Esfera
    public static double calculaAreaEsfera (double radio, double PI) {
        return 4*(PI)*(Math.pow(radio, 2));
    }
}