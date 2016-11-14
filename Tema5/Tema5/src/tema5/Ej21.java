/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej21 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce numeros");
         int cantidad = sc.nextInt();
         int impares = 0;
         int sumaImpares = 0;
         int mayor = 0;
         int num = 0;
         
         for (int i = 1; num >=0; i++){
             System.out.print(i + "numero:" );
             num = sc.nextInt();
             if (num>=0){
                 cantidad++;
             }
             if ((num % 2) == 0){
                 if (num > mayor){
                     mayor = num;
                 }
             }else if (num>0){
                 impares++;
                 sumaImpares = sumaImpares + num;
             }
         }
     System.out.println("La cantidad de números introducidos es: " + cantidad);
    System.out.printf("La media de los números impares es: %.2f", (double)(sumaImpares / impares));
    System.out.println();
    System.out.println("El mayor de los números pares es: " + mayor);
         }
}