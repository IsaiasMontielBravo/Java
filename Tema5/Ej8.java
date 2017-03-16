/*
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej8 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce el numero");
         int n = sc.nextInt();
         
         for (int i = 0; i <= 10; i++){
             System.out.println(n + "x" + i + "=" + n * i);
         }
     }
}
