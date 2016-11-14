/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      System.out.println("introduce el caracter");
      String c;
      c = sc.nextLine();
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
     
      


