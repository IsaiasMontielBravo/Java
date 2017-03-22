/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej23 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         System.out.println("Introduce numeros");
         
         int suma = 0;
         int total = 0;
         int contador = 0;
         
         
         while (suma <10000 ){
             int numeros = sc.nextInt();
             suma += numeros;
             if (suma <= 10000) {
             total = total + numeros;
             contador++;
        }
      }
          System.out.println("Total acumulado: " + total);
      System.out.println("Total de números introducidos: " + contador);
      System.out.print((total / contador) +  "Media de números:");
         }
         
     }

