/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int c = sc.nextInt();
      System.out.println("Introduzca la altura");
      int alturaInicial = sc.nextInt(); 
      
      
      int altura = 1;
    int espacios = alturaInicial - 1;
    int i = 0;

    while (altura <= alturaInicial) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura * 2; i++) {
        System.out.print(c);
      }
      System.out.println();
      espacios--;
      altura++;
    }
  }
}
