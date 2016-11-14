/*
 *Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      System.out.println("Introduzca un numero");
      int n = sc.nextInt(); 
      System.out.println("introduce otro numero");
      int e = sc.nextInt();
      int aux = 0;
      
      if (n==e){
          System.out.println("Los numeros no pueden ser iguales");
      } else {
          if ( n>e){
              aux = n;
              n = e;
              e = aux;
          }
      }
      
      if((e-n) <7){
          System.out.println("La diferencia entre los numeros es menor que 7");
      } else {
          int i = n;
          while (i <=e){
              System.out.println(i);
              i += 7;
          }
      }
      
  }
}

