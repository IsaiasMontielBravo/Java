/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej31 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura");
    int altura = sc.nextInt();
    
    for (int i=0; i <altura; i++){
        System.out.println("*");
        
        }
    for (int j=0; j <((altura/2)+ (1));j++){
            System.out.print("*");
        
    }
    
    
    }
}
