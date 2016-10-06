/*
 * Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej4 {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca las horas trabajadas a la semana:");
     double i = sc.nextInt();
     
     double horasExtra = (i-40);
     double salario1= (i *12);
       
      double salario3= horasExtra * 16;
      
      double total = 480 + salario3;
     if (i<=40){
         
         System.out.println("Su salario es:" + salario1);
     }
     if(i>40){
         
         System.out.println("Su salario es:" + total);
       
         
     }else{
         System.out.println("Introduzca bien la cifra");
     }

    }
}
