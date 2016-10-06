/*
 * Ejercicio 3
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
nombre del día de la semana.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Escriba un numero del 1 al 7:");
     int i = sc.nextInt();
     
     switch(i){
        case 1:
            System.out.println("Lunes");
            break;
             case 2:
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miercoles");
            break;
            case 4:
            System.out.println("Jueves");
            break;
            case 5:
            System.out.println("Viernes");
            break;
            case 6:
            System.out.println("Sabado");
            break;
            case 7:    
            System.out.println("Domingo");
            break;
            default:
                System.out.println("introduzca otro numero");
        
    }
    }  
}
