/*
 *Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej11 {
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca las horas");
         int hora = sc.nextInt();
         System.out.println("Introduzca los minutos");
       int minutos = sc.nextInt();
                 
       int cambio = hora * 3600;
       int cambio2 = minutos * 60;
       int total = cambio + cambio2;
       
       int resta = 86400 - total;
       
       System.out.println("Quedan " + resta + " Segundos para la media noche");
       
       
     }
}
