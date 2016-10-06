/*
 * Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2hg siendo g = 9:81m/s2
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej6 {
  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca el valor de la altura:");
     double a = sc.nextInt(); 
     double g = 9.81;
     double resultado = Math.sqrt(2*a*g);
     
     if(a<1){
        System.out.println("Math error");
     }else{
         System.out.printf("El resultado es: %.2f" , resultado);
     }
  }
}
