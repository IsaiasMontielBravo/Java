/*
 * Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej8 {
 public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduzca la primera nota :");
     double a = sc.nextInt();
     System.out.print("Introduzca la segunda nota:");
     double b = sc.nextInt();
     System.out.print("Introduzca la tercera nota:");
     double c = sc.nextInt();
     
     double media = ((a+b+c)/3);
     
     if(media<5){
         System.out.println("tu media es de:" + media);
         System.out.println("insuficiente");
     }
     if((media>=5)&&(media<=6)){
         System.out.println("tu media es de:" + media);
         System.out.println("Suficiente");
     }
     if((media>=7)&&(media<9)){
         System.out.println("tu media es de:" + media);
         System.out.println("Notable");
     }
     if((media>=9)&&(media<=10)){
         System.out.println("tu media es de:" + media);
         System.out.println("Sobresaliente");
     }
 
}
}
