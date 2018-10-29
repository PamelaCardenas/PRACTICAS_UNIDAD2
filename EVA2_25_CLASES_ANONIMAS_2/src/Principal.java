/*
 * Uso de las clases anónimas
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
        
        //CLASES ANÓNIMAS
        Operaciones objOperacion = new Operaciones(){
            //Método de la interfaz que suma dos variables de tipo entero
            @Override
            public int suma(int val1, int val2) {
                return val1 +val2;
            }

            //Método de la interfaz que suma dos variables de tipo String
            @Override
            public String suma(String cade1, String cade2) {
                return cade1 + cade2;
            }

            //Método de la interfaz que suma dos variables de tipo booleanos
            @Override
            public boolean suma(boolean bool1, boolean bool2) {
                return bool1 && bool2;
            }
            
        };
        
        //Muestra la suma de los tres Métodos
        System.out.println(objOperacion.suma("Mundo", "cruel"));
        System.out.println(objOperacion.suma(10, 10));
        System.out.println(objOperacion.suma(true, false));
        
    }
    
}

 //Interfaz con tres Métodos con diferentes tipos de datos
interface Operaciones{
    public int suma(int val1, int val2); //Método con variables de tipo entero
    public String suma(String cade1, String cade2); //Método con variables de tipo String
    public boolean suma(boolean bool1, boolean bool2); //Método con variables de tipo booleanos
}
