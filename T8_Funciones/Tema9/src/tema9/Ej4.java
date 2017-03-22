/*
 * Dada una base y un exponente devuelve la potencia.
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author isaias
 */
public class Ej4 {
    public static void main(String[] args) {
        System.out.print("devuelve el numero dado una base y un exponente");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        int base = Integer.parseInt(s.nextLine());
        System.out.print("Introduce el exponente");
        int exponente = Integer.parseInt(s.nextLine());
        
        System.out.print("La potencia es");
        System.out.println(varias.potencia(base,exponente));
        
    }
    
}
