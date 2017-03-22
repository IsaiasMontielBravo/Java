/*
 * Ejercicio 2
Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     System.out.print("Que hora es:");
     int i = sc.nextInt();
     
    if ((i>=6)&&(i<=12)){
        System.out.print("Buenos dias");
    }
    if ((i>=13)&&(i<=20)){
        System.out.print("Buenas Tardes");
    }
    if ((i>=21)&&(i<=24)){
        System.out.print("Buenas noches");
        
    }
     if ((i>=1)&&(i<6)){
        System.out.print("Buenas noches");
     }
    if (i>24){
        System.out.print("Introduzca otra hora");
    }
        
    }
    }
   


