/*
 * Escribe un programa que pase de decimal a binario.
 */
package tema9;

import java.util.Scanner;

/**
 *
 *
 */
public class Ej18 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que pase de decimal a binario.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        
        System.out.print("El número en binario es: ");
        varias.decimalAbinario(x);
        
    }
}
