package tema5;

/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 */

/**
 *
 * @author isime
 */
public class Ej6 {
    public static void main(String[] args) {
        System.out.println("Muestra los numeros del 320 al 160 de 20 en 20");
       int i = 360;
        
        do {
            System.out.print(i + ",");
             i = i - 20;
        } while (i >= 160);
              
           }
}
