/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la base");
    int n = sc.nextInt();
    System.out.println("Introduce el exponente");
    int e = sc.nextInt();
    
    int resultado = (int) Math.pow(n,e);
    
    System.out.println("Resultado =" + " " + resultado);
    
    
    
    }
}
