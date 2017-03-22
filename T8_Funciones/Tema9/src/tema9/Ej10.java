/*
 * Le quita a un número n dígitos por delante (por la izquierda).
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author isaias
 */
public class Ej10 {
    public static void main(String[] args) {
        System.out.println("Le quita a un número n dígitos por delante (por la izquierda).");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduzca un número: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la cantidad de dígitos que quiere sacar: ");
        int p = Integer.parseInt(s.nextLine());
        
        System.out.print("El número resultante es: ");
        System.out.println(varias.quitaPorDelante(x, p));
    }
}
