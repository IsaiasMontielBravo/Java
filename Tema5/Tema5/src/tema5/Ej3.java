/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package tema5;

/**
 *
 * @author isime
 */
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Muestra los nuero multiplos de 5");
       int i = 0;
        
        do {
           int multiplicacion = 5*i;
           System.out.println(multiplicacion);
            i++;
        } while (i <= 20);
              
           }
        
    }

