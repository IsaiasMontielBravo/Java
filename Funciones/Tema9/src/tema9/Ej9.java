/*
 * Le quita a un número n dígitos por detrás (por la derecha).
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ej9 {
    public static void main(String[] args) {
    System.out.println("Le quita a un número n dígitos por detrás (por la derecha).");
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el numero");
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce la cantidad de numeros que quiere sacar");
    int p = Integer.parseInt(s.nextLine());
    
    System.out.print("El numero se queda así");
    System.out.println(varias.quitaPorDetras(x,p));
    
    }
    
}
