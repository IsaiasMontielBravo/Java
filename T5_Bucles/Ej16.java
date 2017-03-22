/*
 * Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej16 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    int a=0;
    int i;
    int n;
         System.out.println("Ingrese numero");
         n=sc.nextInt();
         
         for(i=1;i<(n+1);i++){
            if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
    
     }
    }  

