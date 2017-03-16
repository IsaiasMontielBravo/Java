/*
 * Devuelve el menor primo que es mayor al número que se pasa
 * como parámetro.
 */
package Tema9;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Devuelve el menor primo que es mayor al número que se pasa\ncomo parámetro.");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(s.nextLine());

        System.out.print("El número primo inmediatamente superior es: ");
        System.out.println(varias.siguientePrimo(num));
    }
}
