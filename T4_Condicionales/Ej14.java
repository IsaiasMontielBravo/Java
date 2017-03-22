/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej14 {
    public static void main(String[] args) { 
    Scanner s = new Scanner(System.in); 
    System.out.println("Introduzca un numero para saber si es divisible entre 5");
    int a = s.nextInt();
    
    if (a % 2 ==0){
        System.out.println("Tu numero es par");
    }else{
        System.out.println("tu numero no es par");
    }
    
    if (a % 5 == 0){
        System.out.println("Tu numero es divisible por 5");
    }else{
        System.out.println("Tu numero no es divisible por 5");
        
        
    }
    

    
    }
}
