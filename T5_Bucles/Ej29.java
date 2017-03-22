/*
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej29 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int numero = sc.nextInt();
      System.out.println("introduce el numero por el cual no sea divisible");
      int divisible = sc.nextInt();
      
     if (numero > 0) {
      for (int x = 0; x <= numero; x++) {
        if ( (x % divisible) > 0) {
         System.out.println("El número " +  x + " no es divisible por del número " + divisible);
        }
      }
    } else {
      System.out.println("El número introducido debe ser positivo.");
    }
  }
}
