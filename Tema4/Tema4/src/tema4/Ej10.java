/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej10 {
   public static void main(String[] args) { 
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca su mes");
       String mes = sc.nextLine();
       System.out.println("Introduzca el dia de su nacimiento");
       int dia = sc.nextInt();
       
       
       
       
       if (("Enero".equals(mes))&&(dia >= 21)){
           System.out.println("Eres acuario");
           
         }else if (("Febrero".equals(mes))&&(dia < 18)){
           System.out.println("Eres acuario");
        } else if (("Febrero".equals(mes))&&(dia >= 18)){
           System.out.println("Eres Piscis");
       }
           
       
       
               
   
   }
}
