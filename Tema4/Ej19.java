/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej19 {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca un numero para saber su primera cifra");
    System.out.println("Solo se admiten numeros de hasta 5 cifras");
    int x1 = sc.nextInt();
    int resultado = 0;
   
    
    if (x1 < 10) {
     resultado = 1;
    }
    if ((x1 >= 10) && (x1 < 100)) {
    resultado = 2;
    }
    if ((x1 >= 100) && (x1 < 1000)) {
    resultado = 3;
    }
    if ((x1 >= 1000) && (x1 < 10000)){
    resultado = 4;
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
   resultado = 5;
    }
    System.out.println("El numero de cifras es: " + (resultado));
    
        
    
     }
}
