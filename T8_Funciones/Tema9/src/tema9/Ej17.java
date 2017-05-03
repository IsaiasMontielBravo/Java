/*
 * Escribe un programa que pase de binario a decimal.
 */
package tema9;

import java.util.Scanner;

/**
 *
 */
public class Ej17 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que pase de binario a decimal.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número binario: ");
        int x = Integer.parseInt(s.nextLine());
        
        System.out.print("El número en decimal es: " + varias.binarioAdecimal(x));
        
        
    }
}
