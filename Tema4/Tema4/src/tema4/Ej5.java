/*
 * Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0).
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej5 {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca el valor de A:");
     double a = sc.nextInt();
     System.out.print("Introduzca el valor de B:");
     double b = sc.nextInt();
     
     double resultado = -b/a;
     
    if((a==0)&&(b==0)){
        System.out.println("No tiene solucion");
        
    }else {
        System.out.println("El resultado es:" + resultado);
    }
    
    }
     
}
