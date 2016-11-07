/*
 *Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej17 {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      System.out.println("Introduzca un numero");
      int n = sc.nextInt();
      
       int x = 1;
    int suma = 0;
    
    if (n >= 0) {
        while (x <= 100) {
          suma = suma + (n+ x);
          x++;
        }
        System.out.println("La suma de los 100 primeros números al número introducido es: " + suma);
    } else {
      System.out.println("El número introducido no es correcto");
    }
  }
          
}
