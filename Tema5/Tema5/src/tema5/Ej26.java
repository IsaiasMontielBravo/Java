/*
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej26 {
       public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el numero");
      int num = sc.nextInt();
      System.out.println("Introduzca un digito");
      int digito = sc.nextInt();
      int nuevo = 0;
      int posicion = 0;
      int i = 1;
      int j = 10;
      int lugar = 0;

    
    
      while (num > 0) {
      if ((num >= i) && (num <= j)) {
          do {
          nuevo = (num / i);
          num = num % i;
          i = i / 10;
          j = j / 10;
          posicion++;
            if (nuevo == digito) {
              lugar =  posicion;
              System.out.println("El dígito está en la posición: " + lugar);
            }
          } while (num > 0);
        }
      else {
        i = i * 10;
        j = j * 10;
      }
    }
  if (lugar == 0 ) {
    System.out.println("El dígito introducido no está contenido en el número.");
  }
  }
}