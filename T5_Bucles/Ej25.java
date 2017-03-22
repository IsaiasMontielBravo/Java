/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int numero = sc.nextInt();
      int nuevo= 0;
      
      while (numero >0){
          nuevo = (nuevo *10) + (numero % 10);
          numero = numero /10;
      }
      System.out.println("El numero dado la vuelta es: " + nuevo);
    }
}
