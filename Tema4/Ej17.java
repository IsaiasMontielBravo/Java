/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej17 {
     public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un numero para saber su ultima cifra");    
    long n = sc.nextLong();
    
    System.out.println("La ultima cifra es: " + (n%10));

     
     
     }
}
