/*
 * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca la cantidad de numeros que quiere mostrar");
    int n = sc.nextInt();
    int x1 = 0;
    int x2 = 1;
    int aux;
    
    int numeroDigitos=0;
    System.out.println(x1);
    while (n>numeroDigitos){
        aux = x2;
        x2 = x1+x2;
        x1= aux;
        numeroDigitos++;
        System.out.println(x2);
         
        
                
    }
    }
    
}
