/*
 * Ejercicio 7
Realiza un programa que calcule la media de tres notas.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej7 {
     public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca la primera nota :");
     double a = sc.nextInt();
     System.out.print("Introduzca la segunda nota:");
     double b = sc.nextInt();
     System.out.print("Introduzca la tercera nota:");
     double c = sc.nextInt();
     
     double media = ((a+b+c)/3);
     
     if(media<5){
         System.out.println("tu media es de:" + media);
         System.out.println("Estas suspenso");
     }else{
         System.out.println("tu media es de:" + media);
         System.out.println("Enhorabuena estas aprobado");
     }
}
}
