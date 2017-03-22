/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

/**
 *
 * @author isime
 */
public class Ej15 {
    public static void main(String[] args) {
        System.out.println("Muestra los numeros primos que hay entre 1 y 1000.");
        int contador = 0;
        
        for(int x =1;x<=1000;x++){
            if(varias.esPrimo(x)){
                System.out.print("|" + x);
                contador++;
                if((contador%10 == 0)){
                    System.out.println();
                }
            }
        }
    }
}
