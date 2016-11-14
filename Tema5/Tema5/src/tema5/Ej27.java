/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int numero = sc.nextInt();
     int multiplo = 0;
    int suma = 0;
    int cuenta = 0;
    
    if (numero < 0) {
      System.out.println("El número introducido tiene que ser mayor a 1.");
    } else {
      for (int x = 1; x <= numero; x++) {
        if ((x % 3) == 0) {
          System.out.println("El número " + x + " es múltiplo de 3.");
          multiplo = x;
          suma = suma + multiplo;
          cuenta++;
        }
      }
      System.out.println("La cantidad de múltiplos contenidos es : " + cuenta);
      System.out.println("La suma total de los múltiplos de 3 es: " + suma);
    }
  }
}