/*
 * Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     System.out.print("Dia de la semana:");
     String i = sc.next();
     
     switch(i){
        case "Lunes":
            System.out.print("Prog");
            break;
             case "Martes":
            System.out.print("Prog2");
            break;
            case "Miercoles":
            System.out.print("Prog3");
            break;
            case "Jueves":
            System.out.print("Prog4");
            break;
            case "Viernes":
            System.out.print("Prog5");
            break;
            default:
                System.out.print("introduzca otro dia");
        
    }
    }
     
     
    }
    
