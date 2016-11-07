/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
         
         System.out.println("Introduzca el numero");
         long n = sc.nextLong();
         long digitos = 0;
         while (n>0) {
             n = n/10;
             digitos++;
         }
         
         System.out.println("Tu numero tiene " + " " + digitos + " " + "digitos");
    }
}
