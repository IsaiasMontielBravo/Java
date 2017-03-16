/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 */
package tema5;

/**
 *
 * @author isime
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muestra los nuero multiplos de 5");
        
        int i;
        
        for (i = 0;i <= 20;i++){
           int multiplicacion = 5*i;
           System.out.println(multiplicacion);
        }
        
        
    }
    
}
