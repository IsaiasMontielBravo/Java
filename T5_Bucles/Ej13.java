/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduzca 10 numeros");
    int i;
    int positivo = 0;
    int negativo = 0;
    for(i =0;i<10;i++){
        int n = sc.nextInt();
        if (n<0){
            positivo++;
        }else{
            negativo++;
        }
            
    }
    System.out.println("Numeros positivos:" + positivo);
    System.out.println("Numeros Negativos:" + negativo);
    }
}
