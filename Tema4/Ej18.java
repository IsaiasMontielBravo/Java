/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
   introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej18 {
     public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un numero para saber su primera cifra");
    System.out.println("Solo se admiten numeros de hasta 5 cifras");
    int x1 = sc.nextInt();
     x1 = Math.abs(x1);
    int primercifra = 0;
    
    if (x1 < 10) {
    primercifra = x1;
    }
    if ((x1 >= 10) && (x1 < 100)) {
    primercifra = x1/10;
    }
    if ((x1 >= 100) && (x1 < 1000)) {
    primercifra = x1/100;
    }
    if ((x1 >= 1000) && (x1 < 10000)){
    primercifra = x1/1000;
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
    primercifra = x1/10000;
    }
    System.out.println("La primer cifra es: " + (primercifra));
    
        
    
     }
}
