/*
 * Mostrar el empleo del this dentro de una clase
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal {
    
    int iValor; //Creación de variable fuera de la clase Main
    public Principal(){ //Constructor de Principal
        iValor = 10; //Valor asignado a la variable 
    }

    /**
     * @param args the command line arguments
     */
    
    static String sMensaje = "Hola"; //Variable de tipo estática que guarda un valor String

    public static void main(String[] args) {
        // TODO code application logic here

       Principal pObj = new Principal(); //Objeto de la clase Principal
       pObj.imprimir(); //Se llama al método imprimir de la clase Principal
       pObj.imprimir2(10000); //Se llama al método imprimir2 de la clase Principal
       String sMensaje = "Nada de hola"; //Nueva variable que guarda un mensaje de tipo String 
			            //(Con el mismo nombre que tiene la que se encuentra fuera del Main)
        System.out.println(sMensaje); //Mostrar la variable sMensaje
        for (int i=0; i<10; i++) { //Ciclo para, inicia en 0 y termina hasta que el indicador sea igual a 10
            System.out.println(i); //Muestra el número actual del indicador
        }
        
       
    }//Aqui se eliminan todas las variables
    
    public void imprimir() { //Método imprimir
        System.out.println("Valor = " + iValor); //Muestra mensaje con la variable creada antes del Main
    }
    
    public void imprimir2(int iValor) { //M�todo imprimir2
        System.out.println("Valor = " + iValor); //Muestra mensaje con la variable creada antes del Main
        //this es una palabra reservada, se usa para acceder a los miembros de la clase
        //Es un apuntador a la instancia actual de la clase
        System.out.println("Valor del atributo = " + this.iValor); //Muestra mensaje con el valor de la variable de la clase
    }
}
