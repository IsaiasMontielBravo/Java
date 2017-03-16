/*
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej20 {
     public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
         System.out.println("Este programa dibuja una pirámide hueca.");
 System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    String c;
      c = sc.nextLine();
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int alturainicial = sc.nextInt(); 
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;
    int j = 0;
    int relleno = 0;

    while (altura < alturainicial) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      System.out.print(c);
      for (i = 1; i < relleno; i++) {
        System.out.print(" ");
      }
      if (altura > 1) {
        System.out.print(c);
      }
        
      System.out.println();
      espacios--;
      altura++;
      relleno = relleno + 2;;
    }
  
    for (i = 1; i < (alturainicial * 2); i++) {
      System.out.print(c);
    }
    
  }
}
