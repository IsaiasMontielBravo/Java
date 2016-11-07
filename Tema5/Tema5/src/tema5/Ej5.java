/*
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle while.
 */
package tema5;

/**
 *
 * @author isime
 */
public class Ej5 {
     public static void main(String[] args) {
        System.out.println("Muestra los numeros del 320 al 160 de 20 en 20");
    int i = 360;
    
    while (i >= 160){
       System.out.print(i + ",");
       i = i - 20;
    }
    
     }
}
