/*
 * Le añade a un número n un dígitos por delante (por la izquierda).
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author isaias
 */
public class Ej12 {
    public static void main(String[] args) {
        System.out.println("Le añade a un número n un dígitos por delante (por la izquierda).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el dígito que quiere agregar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(varias.agregaPorDelante(x, p));
    }
}
