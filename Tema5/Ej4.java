/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle for.
 */
package tema5;

/**
 *
 * @author isime
 */
public class Ej4 {
     public static void main(String[] args) {
        System.out.println("Muestra los numeros del 320 al 160 de 20 en 20");
     
     
     for (int i = 320; i >= 160; i = (i - 20)) {
      System.out.print(i + ",");
         
     }
     }
}
