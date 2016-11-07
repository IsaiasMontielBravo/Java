/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un numero");
    int n = sc.nextInt();
    
    int cuadrado;
    int cubo;
    int i;
    System.out.println("Numero--Cuadrado--Cubo");
    for (i =0; i<5;i++){
          
          cuadrado = (int) Math.pow(n,2);
          cubo = (int) Math.pow(n,3);
          System.out.println(n + "          " + cuadrado + "        " + cubo);
          n++;
    }
    
    
    
    }
}
