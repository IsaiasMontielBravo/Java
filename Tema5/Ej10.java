/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
         
         int n = 0; 
         int numeroMedia = 0;
         int suma = 0;

         System.out.println("Introduzca la nota");
         while (n>=0){
             
             n = sc.nextInt();
             numeroMedia++;
             suma += n;
         }
         
         System.out.println("Tu media es" + (suma - n)/(numeroMedia - 1));
    
    
    }
         
}
