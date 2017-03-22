/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author isime
 */
public class Ej13 {
     public static void main(String[] args) {
         System.out.println("Toma como parametros las posiciones inicial y final dentro de un numero y devuelve el trozo correspodiente.");
         Scanner s = new Scanner (System.in);
         System.out.print("Introduzca un numero:");
         int x = Integer.parseInt(s.nextLine());
         System.out.print("Introduzca la posicion inicial:");
         int p = Integer.parseInt(s.nextLine());
         System.out.print("Introduca la posicion final");
         int f = Integer.parseInt(s.nextLine());
         
         System.out.print("El numero resultante es:");
         System.out.print(varias.trozoDeNumero(x,p,f));
         
     }
}
