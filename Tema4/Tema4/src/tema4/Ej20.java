/*
 * Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej20 {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un numero para saber si es capicua");
    System.out.println("Solo se admiten numeros de hasta 5 cifras");
    int x1 = sc.nextInt();
 
    



    if (x1 < 10) {
    System.out.println((x1) + ": No es capicúa");
    }
    if ((x1 >= 10) && (x1 < 100)) {
      if ((x1/10) == (x1 % 10)) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 100) && (x1 < 1000)) {
      if ((x1 / 100) == (x1 % 10)) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 1000) && (x1 < 10000)) {
      int primercifra = (x1 / 100);
      int segundacifra = (x1 % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
      int primercifra = (x1 / 1000);
      int segundacifra = (x1 % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((x1) + ": Es capicúa");
      } else {
         System.out.println((x1) + ": No es capicúa");
      }
    }
  } 
}
