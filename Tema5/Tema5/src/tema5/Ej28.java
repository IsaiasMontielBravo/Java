/*
 *Escribe un programa que calcule el factorial de un número entero leído por
teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej28 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int numero = sc.nextInt();
      int factorial = 1;
         if (numero > 0) {
      for (int x = numero; x > 0; x--) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    } else {
      for (int x = numero; x < 0; x++) {
        factorial = factorial * x;
      }
      System.out.println("El factorial del número introducido es: " + factorial);
    }
  }
     }
